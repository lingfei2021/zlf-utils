package com.zlf.utils.java.tools.exception;

public class ExceptionTest {

    public static void main(String[] args) {

        System.out.println(123);

        try {
            testException();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCause().getMessage());
            e.printStackTrace();
        }

        try {
            testNullException();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCause().getMessage());
            e.printStackTrace();
        }
    }

    private static void testException() {
        try {
            int i = 2/0;

        } catch (Exception e) {
            throw new BaseException(e);
        }
    }

    private static void testNullException() {
        String s = null;
        try {
            s.toString();
        } catch (Exception e) {
            throw new BaseException(e);
        }
    }
}
