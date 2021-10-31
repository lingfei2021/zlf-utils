package com.zlf.utils.sparkjava.blog.handler;

import com.google.gson.Gson;
import com.zlf.utils.sparkjava.blog.bean.Blog;
import com.zlf.utils.sparkjava.blog.bean.Resp;
import org.apache.commons.lang3.StringUtils;
import spark.Request;
import spark.Response;
import spark.Route;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public enum BlogHandler implements Route {
    GET {
        @Override
        public Object handle(Request request, Response response) throws Exception {
            Object result = null;
            Integer page = 1;
            Integer size = 2;

            long id = getId(request);
            if(id >= 0){
                result = blogsMap.get(id);
            }else {
                String pageParam = request.queryParams("page");
                if(!StringUtils.isEmpty(pageParam)){
                    page = Integer.valueOf(pageParam);
                    int total = (page-1) * size;
                    int total1 = page * size;
                    List<Object> list = blogsMap.values().stream().filter( b -> {
                        if(total < b.getId() && b.getId() <= total1){
                            return true;
                        }
                        return false;
                    }).collect(Collectors.toList());
                    result = list;
                }
            }
            Resp resp = Resp.create(200, "OK", result);
            if (result.getClass() != Blog.class) {
                resp.count = ((List)result).size();
                resp.page = page;
            }
            return resp;
        }
    },

    POST {
        @Override
        public Object handle(Request request, Response response) throws Exception {
            Gson gson = new Gson();
            Blog blog = gson.fromJson(request.body(), Blog.class);

            String field = null;
            if (StringUtils.isEmpty(blog.author)) {
                field = "author";
            } else if (StringUtils.isEmpty(blog.content)) {
                field = "content";
            } else if (StringUtils.isEmpty(blog.title)) {
                field = "title";
            }
            if (field != null) {
                return Resp.create(400, " `" + field + "` is empty!");
            } else {
                blog.setId(blogsMap.size()+1);
                blogsMap.put(blog.id, blog);
                return Resp.create(200, "OK", blog);
            }
        }
    },

    PUT {
        @Override
        public Object handle(Request request, Response response) throws Exception {
            long id = getId(request);
            if (id >=0 ) {
                Blog blog = blogsMap.get(id);
                if (blog == null) {
                    return Resp.create(400, "No Such Element:" + id);
                } else {
                    Gson gson = new Gson();
                    Blog requestBody = gson.fromJson(request.body(), Blog.class);
                    if (requestBody.content == null && requestBody.title == null && requestBody.author == null) {
                        return Resp.create(400, "Can't find any field of Blog", gson.fromJson(request.body(), Map.class));
                    } else {
                        if (!StringUtils.isEmpty(requestBody.author)) {
                            blog.author = requestBody.author;
                        }
                        if (!StringUtils.isEmpty(requestBody.title)) {
                            blog.title = requestBody.title;
                        }
                        if (!StringUtils.isEmpty(requestBody.content)) {
                            blog.content = requestBody.content;
                        }
                        return Resp.create(200, "OK", blog);
                    }
                }
            }
            return Resp.create(400, "Miss `id` attribute");
        }
    },

    DELETE {
        @Override
        public Object handle(Request request, Response response) throws Exception {
            long id = getId(request);
            if (id >= 0) {
                blogsMap.remove(id);
                return Resp.create(200, "OK");
            }
            return Resp.create(400, "Miss `id` attribute");
        }
    },

    HEAD {
        @Override
        public Object handle(Request request, Response response) throws Exception {
            return Resp.create(200, "OK");
        }
    };

    private static Map<Long, Blog> blogsMap = genBlogMap();
    private static Map<Long, Blog> genBlogMap(){
        HashMap<Long, Blog> map = new HashMap<>();
        map.put(1l, Blog.builder().id(1).author("a").title("title1").content("content1").build());
        map.put(2l, Blog.builder().id(2).author("b").title("title2").content("content2").build());
        map.put(3l, Blog.builder().id(3).author("c").title("title3").content("content3").build());
        map.put(4l, Blog.builder().id(4).author("d").title("title4").content("content4").build());
        map.put(5l, Blog.builder().id(5).author("e").title("title5").content("content5").build());
        return map;
    }
    private static long getId(Request request){
        String id = request.params("id");
        String idInQueryString = request.queryParams("id");

        if (id == null && idInQueryString == null) {
            return -1;
        } else if (id == null) {
            id = idInQueryString;
        }
        try {
            return Long.parseLong(id);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("bad id:`" + id + "`");
        }
    }
}