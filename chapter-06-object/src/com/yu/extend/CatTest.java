package com.yu.extend;

/**
 * 猫(子类)
 *
 * @author Yu
 * @create 2026-03-14 22:56
 */
public class CatTest {
    public static void main(String[] args) {
        // 创建一个猫类对象
        Cat cat = new Cat();
        // 为该猫类对象的name属性进行赋值
        cat.name = "Tom";
        // 为该猫类对象的age属性进行赋值
        cat.age = 2;
        // 调用该猫继承来的eat()方法
        cat.eat();
        // 调用该猫的catchMouse()方法
        cat.catchMouse();
        cat.catchMouse();
        cat.catchMouse();
    }
}
class Cat extends Animal {
    int count;
    public void catchMouse() {
        count++;
        System.out.println(name + "抓到了" + count +"只老鼠");
    }
}
