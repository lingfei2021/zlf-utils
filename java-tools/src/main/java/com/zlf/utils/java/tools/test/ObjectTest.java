package com.zlf.utils.java.tools.test;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

public class ObjectTest {

    public static void main(String[] args) {
        System.out.println(123);
        System.out.println(new OO().getI());
        System.out.println(OO.builder().build().getI());
    }
}
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
class OO{
    private Integer i = 0;
}