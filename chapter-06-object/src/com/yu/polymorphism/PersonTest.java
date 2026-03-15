package com.yu.polymorphism;

/**
 * 方法的形参声明体现多态
 *
 * @author Yu
 * @create 2026-03-15 21:36
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();

        Dog dog = new Dog();
        dog.setNickname("小黄");
        p1.adopt(dog);//实参是dog子类对象，形参是父类Pet类型
        p1.feed();

        Cat cat = new Cat();
        cat.setNickname("雪球");
        p1.adopt(cat);//实参是cat子类对象，形参是父类Pet类型
        p1.feed();
    }
}

class Person {
    private Pet pet;

    //形参是父类类型，实参是子类对象
    public void adopt(Pet pet) {
        this.pet = pet;
    }

    public void feed(){
        pet.eat();//pet实际引用的对象类型不同，执行的eat方法也不同
    }
}
