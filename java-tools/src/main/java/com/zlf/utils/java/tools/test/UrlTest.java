package com.zlf.utils.java.tools.test;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public class UrlTest {

    public static void main(String[] args) throws Exception{
        test1();
        test2();
    }

    private static void test1() throws Exception{
        String src ="https://img.shopoases.com/images/O1CN018xD3J51KApthnOD0M_!!2208855291124-0-cib.jpg?d=1200x1600";
        URL url = new URL(src);
        HttpURLConnection urlConnection = (HttpURLConnection)url.openConnection();
        int code = urlConnection.getResponseCode();

        System.out.println(code);
    }
    private static void test2()throws Exception{
        String src ="https://img.shopoases.com/images/O1CN018xD3J51KApthnOD0M_!!2208855291124-0-cib123.jpg";
        URL url = new URL(src);
        HttpURLConnection urlConnection = (HttpURLConnection)url.openConnection();
        int code = urlConnection.getResponseCode();

        System.out.println(code);
    }
}
