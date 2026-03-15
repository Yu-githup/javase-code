package com.yu.keyword._object;

/**
 * clone()方法的使用
 *
 * @author Yu
 * @create 2026-03-15 23:54
 */
public class CloneTest {
    public static void main(String[] args) {
        Animal a1 = new Animal("花花");
        try {
            Animal a2 = (Animal) a1.clone();
            System.out.println("原始对象：" + a1);
            System.out.println("克隆对象：" + a2);
            a2.setName("毛毛");
            System.out.println("clone之后的对象：" + a2);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}

class Animal implements Cloneable {
    private String name;

    public Animal() {
        super();
    }

    public Animal(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal [name=" + name + "]";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }

}
