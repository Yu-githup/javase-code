package com.yu.keyword._instanceof;

/**
 * instanceof关键字使用
 *
 * @author Yu
 * @create 2026-03-15 22:14
 */
public class InstanceofTest {
    public static void main(String[] args) {
        Pet[] pets = new Pet[2];
        pets[0] = new Dog();//多态引用
        pets[0].setNickname("小白");

        pets[1] = new Cat();//多态引用
        pets[1].setNickname("雪球");

        for (int i = 0; i < pets.length; i++) {
            pets[i].eat();
            if(pets[i] instanceof Dog){
                Dog dog = (Dog) pets[i];
                dog.watchHouse();
            }else if(pets[i] instanceof Cat){
                Cat cat = (Cat) pets[i];
                cat.catchMouse();
            }
        }
    }
}
class Pet{
   private String nickname;

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void eat(){
        System.out.println(nickname + "正在吃东西");
    }
}

class Dog extends Pet{
    @Override
    public void eat() {
        System.out.println("小狗" + getNickname() + "啃骨头");
    }

    public void watchHouse() {
        System.out.println("小狗正在看家");
    }
}

class Cat extends Pet {
    @Override
    public void eat() {
        System.out.println("小猫" + getNickname() + "吃鱼");
    }

    public void catchMouse() {
        System.out.println("小猫在抓老鼠");
    }

}
