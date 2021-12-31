package com.zlf.utils.java.tools.json;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class JsonStrTest {

    public static void main(String[] args) {
        test();
    }
    private static void test(){
        List<ImageVo> images = new ArrayList<>();
        images.add(ImageVo.builder().src("121").build());
        images.add(ImageVo.builder().src("232").build());
        images.add(ImageVo.builder().src("3434").build());

        System.out.println(images);
        System.out.println(JSON.toJSONString(images));
        HashMap<Object, Object> ma = new HashMap<>();
        ma.put("aaa", images);
        System.out.println(JSON.toJSONString(ma));
    }
}
