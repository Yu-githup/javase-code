package com.yu.polymorphism;

/**
 * 方法内局部变量的赋值体现多态
 *
 * @author Yu
 * @create 2026-03-15 21:34
 */
public class TestPet {
    public static void main(String[] args) {
        // 多态引用
        Pet dog = new Dog();
        dog.setNickname("小白");

        //多态的表现形式
        /*
            编译时看父类：只能调用父类声明的方法，不能调用子类扩展的方法；
            运行时，看“子类”，如果子类重写了方法，一定是执行子类重写的方法体；
            这也是为啥前面说多态的前提是继承关系 + 方法重写
         */
        dog.eat();
        //运行时执行子类Dog重写的方法
        // pet.watchHouse();//不能调用Dog子类扩展的方法

        Pet cat = new Cat();
        cat.setNickname("雪球");
        cat.eat();//运行时执行子类Cat重写的方法
    }
}
