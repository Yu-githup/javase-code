package com.yu.extend.exer;

/**
 * 继承练习1
 * 定义一个学生类Student，它继承自Person类
 *
 * @author Yu
 * @create 2026-03-14 23:09
 */
public class Person {
    String name;
    char gender;
    int age;

    public Person(){

    }

    public Person(String name, char gender, int age) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String toString() {
        return "";
    }
}
