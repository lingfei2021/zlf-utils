package com.zlf.utils.java.tools.chinese;

import org.apache.commons.lang3.StringUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestChinese {

    public static void main(String[] args) {
        test();
    }
    private static void test(){
        String s = "abaf第三方的身份dfdf";
        System.out.println(isContainChinese(s));
    }
    /**
     * 字符串是否包含中文
     *
     * @param str 待校验字符串
     * @return true 包含中文字符 false 不包含中文字符
     * @throws Exception
     */
    public static boolean isContainChinese(String str) {

        Pattern p = Pattern.compile("[\u4E00-\u9FA5|\\！|\\，|\\。|\\（|\\）|\\《|\\》|\\“|\\”|\\？|\\：|\\；|\\【|\\】]");
        Matcher m = p.matcher(str);
        if (m.find()) {
            return true;
        }
        return false;
    }
}
