package com.yu.keyword._object;

import java.util.Date;

/**
 * equals练习
 *
 * @author Yu
 * @create 2026-03-15 23:21
 */
public class EqualsTest1 {
    public static void main(String[] args) {
        int it = 65;
        float fl = 65.0f;
        System.out.println(it == fl); // true

        char ch1 = 'A'; char ch2 = 12;
        System.out.println("65和'A'是否相等？" + (it == ch1));// true
        System.out.println("12和ch2是否相等？" + (12 == ch2));// true

        String str1 = new String("hello");
        String str2 = new String("hello");
        // 比较的内存地址
        System.out.println("str1和str2是否相等？"+ (str1 == str2));//false

        // 使用的String重写的equals方法,比较的是内容
        System.out.println("str1是否equals str2？"+(str1.equals(str2)));// true
        System.out.println("hello" == new Date().toString()); // false
    }
}
