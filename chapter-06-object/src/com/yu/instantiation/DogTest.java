package com.yu.instantiation;

/**
 * 生物（子类对象实例化过程）
 *
 * @author Yu
 * @create 2026-03-15 21:09
 */
public class DogTest {
    public static void main(String[] args) {
        new Dog();
    }
}

class Creature {
    public Creature(){
        System.out.println("Creature无参数的构造器"); // ①
    }
}

class Animal extends  Creature{
    public Animal(String name) {
        System.out.println("Animal带一个参数的构造器，该动物的name为" + name); // ②
    }

    public Animal(String name, int age) {
        this(name);
        System.out.println("Animal带两个参数的构造器，其age为" + age); // ③
    }
}

class Dog extends Animal {
    public Dog(){
        super("汪汪队阿黄", 3);
        System.out.println("Dog无参数的构造器"); // ④
    }
}

