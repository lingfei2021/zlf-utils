package com.zlf.utils.sparkjava.blog.bean;

public class Resp {
    public int code;
    public String msg;
    public Object data;
    public long count;
    public long page;

    public static Resp create(int code, String msg) {
        return create(code, msg, null);
    }

    public static Resp create(int code, String msg, Object data) {
        Resp resp = new Resp();
        resp.code = code;
        resp.msg = msg;
        resp.data = data;
        return resp;
    }
}