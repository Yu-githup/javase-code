package com.yu.polymorphism.exer;

/**
 * 多态练习：继承成员变量和继承方法的区别
 *
 * @author Yu
 * @create 2026-03-15 22:20
 */
public class FieldMethodTest {
    public static void main(String[] args) {
        Sub s = new Sub();
        System.out.println(s.count); // 20
        s.display();

        Base b = s; // 向上转型（自动完成）
        System.out.println(b == s); // true
        System.out.println(b.count); // 10
        b.display(); // 20
    }
}

class Base {
    int count = 10;

    public void display() {
        System.out.println(this.count); // 20
    }
}

class Sub extends  Base {
    int count = 20;

    @Override
    public void display() {
        System.out.println(this.count); // 20
    }
}