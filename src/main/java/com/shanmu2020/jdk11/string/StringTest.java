package com.shanmu2020.jdk11.string;

import org.junit.Test;

public class StringTest {
    @Test
    public void test5() {
        // 判断字符串是否为空白
        boolean blank = " ".isBlank();// true
        System.out.println("blank = " + blank);
        // 去除首尾空格
        String strip = " Hello Java11 ".strip();// "Hello Java11"
        System.out.println("strip = " + strip);
        // 去除尾部空格
        String stripTrailing = " Hello Java11 ".stripTrailing();// " Hello Java11"
        System.out.println("stripTrailing = " + stripTrailing);
        // 去除首部空格
        String stripLeading = " Hello Java11 ".stripLeading();// "Hello Java11 "
        System.out.println("stripLeading = " + stripLeading);
        // 复制字符串
        String repeat = "Java11".repeat(3);// "Java11Java11Java11"
        System.out.println("repeat = " + repeat);
        // 行数统计
        long count = "A\nB\nC".lines().count();// 3
        System.out.println("count = " + count);
    }
}
