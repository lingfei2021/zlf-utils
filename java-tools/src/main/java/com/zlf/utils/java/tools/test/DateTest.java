package com.zlf.utils.java.tools.test;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Date;

public class DateTest {

    public static void main(String[] args) {
        test();
        test1();
    }

    private static void test(){

        String d = LocalDateTime.now(ZoneOffset.UTC).toString();
        System.out.println(d);
    }

    private static void test1(){
        String yearMonth = new SimpleDateFormat("yyMMdd").format(new Date());
        System.out.println(yearMonth);
    }
}
