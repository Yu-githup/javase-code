package com.yu.polymorphism;

/**
 * 实例变量没有多态
 *
 * @author Yu
 * @create 2026-03-15 21:59
 */
public class VariableTest {
    public static void main(String[] args) {
        Base b = new Sub();
        System.out.println(b.a); // 输出父类Base的1
        System.out.println(((Sub)b).a); // 输出Sub的2
    }
}
class Base{
    int a = 1;
}
class Sub extends Base{
    int a = 2;
}
