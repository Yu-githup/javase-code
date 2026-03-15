package com.yu.keyword._object;

/**
 * toString()方法测试
 *
 * @author Yu
 * @create 2026-03-15 23:42
 */
public class ToStringTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        System.out.println(p1);
    }
}

class Person {
    private String name = "Tom";
    private int age = 18;

    @Override
    public String toString() {
        return "Person ----" + name + ":" + age + "-----";
    }
}
