package com.zlf.utils.sparkjava.blog;

import com.google.gson.Gson;
import com.zlf.utils.sparkjava.blog.bean.Resp;
import com.zlf.utils.sparkjava.blog.handler.BlogHandler;
import com.zlf.utils.sparkjava.blog.handler.FormHandler;
import com.zlf.utils.sparkjava.blog.handler.GsonTransformer;
import com.zlf.utils.sparkjava.blog.handler.HeaderHandler;
import spark.*;

public class RESTServer {
    static final String TYPE = "application/json; charset=UTF-8";

    public static void main(String[] args) {
        Spark.init();

        Spark.get("/blog", BlogHandler.GET, GsonTransformer.getDefault());
        Spark.get("/blog/:id", BlogHandler.GET, GsonTransformer.getDefault());

        Spark.post("/blog", BlogHandler.POST, GsonTransformer.getDefault());

        Spark.put("/blog", BlogHandler.PUT, GsonTransformer.getDefault());
        Spark.put("/blog/:id", BlogHandler.PUT, GsonTransformer.getDefault());

        Spark.delete("/blog", BlogHandler.DELETE, GsonTransformer.getDefault());
        Spark.delete("/blog/:id", BlogHandler.DELETE, GsonTransformer.getDefault());

        Spark.head("/blog", BlogHandler.HEAD, GsonTransformer.getDefault());
        Spark.head("/blog/:id", BlogHandler.HEAD, GsonTransformer.getDefault());

        Spark.post("/form", new FormHandler(), GsonTransformer.getDefault());

        Spark.get("/headers", new HeaderHandler(), GsonTransformer.getDefault());

        Spark.after(new Filter() {
            @Override
            public void handle(Request request, Response response) throws Exception {
                response.type(TYPE);
                response.header("author", "L");
            }
        });

        Spark.exception(RuntimeException.class, new ExceptionHandler() {
            @Override
            public void handle(Exception exception, Request request, Response response) {
                Gson gson = new Gson();
                response.body(gson.toJson(Resp.create(400, exception.getMessage())));
            }
        });
        Spark.exception(Exception.class, new ExceptionHandler() {
            @Override
            public void handle(Exception exception, Request request, Response response) {
                Gson gson = new Gson();
                response.body(gson.toJson(Resp.create(500, exception.getMessage())));
            }
        });
    }
}