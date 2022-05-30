package com.zlf.utils.java.tools.test;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListTest {

    public static void main(String[] args) {
        System.out.println(123);

        test1();
    }

    private static void test(){
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,3));

//        list1.addAll(list2);
        list1.removeAll(list2);

        System.out.println(list1);
        System.out.println(list2);
    }

    private static void test(List<Integer> list){

//        System.out.println(list.get(0));

//        list.stream().forEach( l -> System.out.println(l));
    }
    private static void test1(){
        List<Object> list = new ArrayList<>();
        System.out.println(list);
        System.out.println(JSON.toJSONString(list));
    }
}
