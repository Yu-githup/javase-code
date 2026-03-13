package com.yu.keyword._this.exer;

/**
 * this关键字练习
 *
 * @author Yu
 * @create 2026-03-13 23:00
 */
public class Boy {
    private String name;
    private int age;

    public Boy (String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void marry(Girl girl) {
        System.out.println("我要娶：" + girl.getName());
    }

    public void shout() {

    }
}
