package com.yu.polymorphism;

/**
 * 方法的返回值类型体现多态
 *
 * @author Yu
 * @create 2026-03-15 21:41
 */
public class TestPetShop {
    public static void main(String[] args) {
        PetShop shop = new PetShop();
        Pet dog = shop.sale("Dog");
        dog.setNickname("小黑");
        dog.eat();

        Pet cat = shop.sale("Cat");
        cat.setNickname("煤炭");
        cat.eat();

    }
}

class PetShop {
    //返回值类型是父类类型，实际返回的是子类对象
    public Pet sale(String type){
        switch (type) {
            case "Dog":
                return new Dog();
            case "Cat":
                return new Cat();
        }
        return null;
    }
}
