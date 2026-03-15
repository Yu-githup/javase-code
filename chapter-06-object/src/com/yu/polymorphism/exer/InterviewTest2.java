package com.yu.polymorphism.exer;

/**
 * 练习2
 *
 * @author Yu
 * @create 2026-03-15 22:29
 */
public class InterviewTest2 {
    public static void main(String[] args) {
        Father f = new Father();
        Son s = new Son();
        System.out.println(f.getInfo());//大头爸爸
        System.out.println(s.getInfo());//小头儿子
        s.test();//小头儿子 大头爸爸
        System.out.println("-----------------");
        s.setInfo("aaa");
        System.out.println(f.getInfo());//大头爸爸
        System.out.println(s.getInfo());//aaa
        s.test();// aaa 大头爸爸
    }
}
class Father {
    private String info = "大头爸爸";

    public void setInfo(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }
}

class Son extends Father {
    private String info = "小头儿子";

    @Override
    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String getInfo() {
        return info;
    }

    public void test() {
        System.out.println(this.getInfo());
        System.out.println(super.getInfo());
    }
}
