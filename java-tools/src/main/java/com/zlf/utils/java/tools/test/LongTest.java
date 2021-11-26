package com.zlf.utils.java.tools.test;

public class LongTest {

    public static void main(String[] args) {
        test1();
        test2();
    }

    private static void test1() {
        Long a = 127l;
        Long b = 127l;
        System.out.println(a==b);
    }
    private static void test2() {
        Long a = 128l;
        Long b = 128l;
        System.out.println(a==b);
    }
}
