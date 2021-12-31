package com.zlf.utils.java.tools.image;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class ImageTest {

    public static void main(String[] args) {
        test();
    }
    private static void test(){
        getImageStream("https://img.shopoases.com/B-productImages/OA123BP1640833480685.jpg");
        getImageStream("https://img.shopoases.com/images/B1640835038150.jpg");
    }

    private static InputStream getImageStream(String url) {
        HttpURLConnection connection = null;
        try {
            connection = (HttpURLConnection) new URL(url).openConnection();
            connection.setReadTimeout(5000);
            connection.setConnectTimeout(5000);
            connection.setRequestMethod("GET");
            if (connection.getResponseCode() == HttpURLConnection.HTTP_OK) {
                System.out.println(connection.getContentType());
                System.out.println(connection.getContentLength());
                return connection.getInputStream();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
