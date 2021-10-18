package com.zlf.utils.java.main.test;

import java.math.BigDecimal;

public class BigDecimalTest {
    public static void main(String[] args) {
        System.out.println(123);
        addMultiply();
        multiplyDivide();
    }

    private  static void addMultiply(){
        BigDecimal originalPrice = new BigDecimal(0);
        originalPrice = originalPrice.add(new BigDecimal(1).multiply(new BigDecimal(1)));
        System.out.println(originalPrice);
    }
    private  static void multiplyDivide(){
        String typeValue = "123.1";
        System.out.println(typeValue);
        BigDecimal bigDecimal = new BigDecimal(typeValue).multiply(new BigDecimal(100));
        System.out.println(bigDecimal.toString());

        BigDecimal bigDecimal1 = new BigDecimal(bigDecimal.toString()).divide(new BigDecimal(100));
        System.out.println(bigDecimal1.toString());
    }
}
