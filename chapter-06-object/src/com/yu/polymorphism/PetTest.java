package com.yu.polymorphism;

/**
 * 宠物：测试多态性
 *
 * @author Yu
 * @create 2026-03-15 21:28
 */
public class PetTest {
    public static void main(String[] args) {
        Pet cat = new Cat();
        cat.setNickname("tom");
        cat.eat();
        // cat.catchMouse(); 编译不通过


        Pet dog = new Dog();
        dog.setNickname("jack");
        dog.eat();
        // dog.watchHouse(); 编译不通过
    }
}

class Pet {
    // 昵称
    private String nickname;

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void eat() {
        System.out.println(nickname + "吃东西");
    }
}

class Cat extends Pet {

    //子类重写父类的方法
    @Override
    public void eat() {
        System.out.println("小猫" + getNickname() + "在吃鱼");
    }

    // 抓老鼠
    public void catchMouse() {
        System.out.println("小猫在抓老鼠");
    }
}

class Dog extends Pet {
    //子类重写父类的方法
    @Override
    public void eat() {
        System.out.println("小狗" + getNickname() + "吃骨头");
    }

    //子类扩展的方法
    public void watchHouse() {
        System.out.println("小狗正在看家");
    }
}