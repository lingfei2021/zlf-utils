package com.zlf.utils.java.tools.test;

import org.apache.commons.lang3.StringUtils;

public class DoubleTest {
    public static void main(String[] args) {
        test();
    }
    private static void test(){
        String s = "10.00";
        String s1 = "110.00";
        //如果原价不等于0，原价必须大于售价 @L
        if(!StringUtils.isEmpty(s)){
            Double originalPrice = Double.valueOf(s);
            int i = originalPrice.compareTo(0.0);
            if(i>0){
                if(StringUtils.isEmpty(s1)){
                    System.out.println("原价必须大于售价！");
                }
                int i1 = originalPrice.compareTo(Double.valueOf(s1));
                if(i1 <= 0){
                    System.out.println("原价必须大于售价！");
                }
            }
        }
    }

}
