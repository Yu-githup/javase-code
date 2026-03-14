package com.yu.extend;

/**
 * 动物类（父类）
 *
 * @author Yu
 * @create 2026-03-14 22:54
 */
public class Animal {
    String name;
    int age;

    public void eat() {
        System.out.println(age + "岁的" + name + "正在吃东西");
    }
}
