package com.zlf.utils.java.tools.test;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTest {

    public static void main(String[] args) {
//        test();
//        test1();
        test2();
    }

    private static void test(){

        String d = LocalDateTime.now(ZoneOffset.UTC).toString();
        System.out.println(d);
    }

    private static void test1(){
        String yearMonth = new SimpleDateFormat("yyMMdd").format(new Date());
        System.out.println(yearMonth);
    }
    private static void test2(){
        long l = LocalDateTime.now().toLocalDate().toEpochDay();
        LocalDate dateTime= LocalDate.parse("2022-04-25", DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        System.out.println("DateTest.test2 "+(l -dateTime.toEpochDay()));
    }
}
