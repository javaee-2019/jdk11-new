package com.shanmu2020.jdk11.string;

import org.junit.Test;

public class StringTest {
    @Test
    public void test5() {
        boolean blank = " ".isBlank();// true
        System.out.println("判断字符串是否为空白 " + blank);

        String strip = " Hello Java11 ".strip();// "Hello Java11"
        System.out.println("去除首尾空格 " + strip);

        String stripTrailing = " Hello Java11 ".stripTrailing();// " Hello Java11"
        System.out.println("去除尾部空格 " + stripTrailing);

        String stripLeading = " Hello Java11 ".stripLeading();// "Hello Java11 "
        System.out.println("去除首部空格 " + stripLeading);

        String repeat = "Java11".repeat(3);// "Java11Java11Java11"
        System.out.println("复制字符串 " + repeat);

        long count = "A\nB\nC".lines().count();// 3
        System.out.println("行数统计 " + count);
    }

    @Test
    public void test28() {
    }
}
