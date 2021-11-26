package com.zlf.utils.java.tools.test;


import org.apache.commons.lang3.StringUtils;

public class StringTest {

    public static void main(String[] args) {
        System.out.println(123);

//        test();
//        test1();
        test3();
    }
    private static void test(){
        String style = "123123abc";
        String bodyHtml = "<div class=\\\"product-details\\\">\\n    <p class=\\\"product-details-tittle\\\">DETAILS</p>\\n    <ul class=\\\"details-list font14\\\">\\n        <li>\\n            <span>Fabric</span>: <span>Non-stretch</span>\\n        </li>\\n        <li>\\n            <span>Fit Type</span>: <span>Slim Fit</span>\\n        </li>\\n        <li>\\n            <span>Occasion</span>: <span>Work, Party</span>\\n        </li>\\n        <li>\\n            <span>Pattern Type</span>: <span>Plain</span>\\n        </li>\\n        <li>\\n            <span>Sleeve Length</span>: <span>Sleeveless</span>\\n        </li>\\n        <li>\\n            <span>Style</span>: <span>Statement</span>\\n        </li>\\n    </ul>\\n</div>\\n\\n<div class=\\\"goods-size-table\\\">\\n    <p class=\\\"product-details-tittle\\\">SIZE GUIDE</p>\\n    <div class=\\\"goods-size-change\\\">\\n        <a class=\\\"goods-tittle goods-size-active\\\">Cm</a>\\n        <a class=\\\"goods-tittle\\\">Inch</a>\\n    </div>\\n    <div class=\\\"goods-table\\\">\\n        <table>\\n            <thead>\\n            <tr>\\n                <th><span>Size</span></th>\\n                <th><span>Length</span></th>\\n                <th><span>Bust</span></th>\\n                <th><span>Waist</span></th>\\n            </tr>\\n            </thead>\\n            <tbody>\\n            <tr class=\\\"goods-size-cm isblock\\\">\\n                <td>\\n                    <span>XS</span>\\n                </td>\\n                <td>\\n                    <span>105</span>\\n                </td>\\n                <td>\\n                    <span>80</span>\\n                </td>\\n                <td>\\n                    <span>31</span>\\n                </td>\\n            </tr>\\n            <tr class=\\\"goods-size-cm isblock\\\">\\n                <td>\\n                    <span>S</span>\\n                </td>\\n                <td>\\n                    <span>106</span>\\n                </td>\\n                <td>\\n                    <span>84</span>\\n                </td>\\n                <td>\\n                    <span>35</span>\\n                </td>\\n            </tr>\\n            <tr class=\\\"goods-size-cm isblock\\\">\\n                <td>\\n                    <span>M</span>\\n                </td>\\n                <td>\\n                    <span>107</span>\\n                </td>\\n                <td>\\n                    <span>88</span>\\n                </td>\\n                <td>\\n                    <span>39</span>\\n                </td>\\n            </tr>\\n            <tr class=\\\"goods-size-cm isblock\\\">\\n                <td>\\n                    <span>L</span>\\n                </td>\\n                <td>\\n                    <span>108.5</span>\\n                </td>\\n                <td>\\n                    <span>94</span>\\n                </td>\\n                <td>\\n                    <span>45</span>\\n                </td>\\n            </tr>\\n            <tr class=\\\"goods-size-in\\\">\\n                <td>\\n                    <span>XS</span>\\n                </td>\\n                <td>\\n                    <span>41.3</span>\\n                </td>\\n                <td>\\n                    <span>31.5</span>\\n                </td>\\n                <td>\\n                    <span>12.2</span>\\n                </td>\\n            </tr>\\n            <tr class=\\\"goods-size-in\\\">\\n                <td>\\n                    <span>S</span>\\n                </td>\\n                <td>\\n                    <span>41.7</span>\\n                </td>\\n                <td>\\n                    <span>33.1</span>\\n                </td>\\n                <td>\\n                    <span>13.8</span>\\n                </td>\\n            </tr>\\n            <tr class=\\\"goods-size-in\\\">\\n                <td>\\n                    <span>M</span>\\n                </td>\\n                <td>\\n                    <span>42.1</span>\\n                </td>\\n                <td>\\n                    <span>34.6</span>\\n                </td>\\n                <td>\\n                    <span>15.4</span>\\n                </td>\\n            </tr>\\n            <tr class=\\\"goods-size-in\\\">\\n                <td>\\n                    <span>L</span>\\n                </td>\\n                <td>\\n                    <span>42.7</span>\\n                </td>\\n                <td>\\n                    <span>37</span>\\n                </td>\\n                <td>\\n                    <span>17.7</span>\\n                </td>\\n            </tr>\\n            </tbody>\\n        </table>\\n    </div>\\n</div>\\n";
        String bodyHtml2 = "";
        if(!StringUtils.isEmpty(style)){
            int indexOf = bodyHtml.indexOf("<span>Style</span>");
            String start = bodyHtml.substring(0,indexOf);
            String s2 = bodyHtml.substring(indexOf+18, bodyHtml.length());
            int spani = s2.indexOf("</span>");
            String end = s2.substring(spani, s2.length());

            bodyHtml2 = start+"<span>Style</span>: <span>"+style+end;

            System.out.println(bodyHtml);
            System.out.println(bodyHtml2);
        }
    }
    private static void test1(){
        String s = "123";
        test2(s);
        System.out.println(s);
    }
    private static void test2(String s){
        s += "456";
        System.out.println(s);
    }

    private static void test3(){
        String seq = StringUtils.leftPad(Long.toString(12), 3, "0");
        System.out.println(seq);
    }
}
