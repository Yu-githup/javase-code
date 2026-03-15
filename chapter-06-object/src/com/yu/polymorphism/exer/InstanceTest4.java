package com.yu.polymorphism.exer;

/**
 * 练习4
 *
 * @author Yu
 * @create 2026-03-15 22:34
 */
public class InstanceTest4 {
    public static void main(String[] args) {
        InstanceTest4 i4 = new InstanceTest4();

        i4.method(new Person());
        System.out.println("-----------");
        i4.method(new Student());

        System.out.println("-----------");
        i4.method(new Graduate());
    }

    public void method(Person e){
        String info = e.getInfo();
        if (e instanceof Person) {
            System.out.println("a person");
        }

        if (e instanceof Student) {
            System.out.println("a student");
        }

        if (e instanceof Graduate) {
            System.out.println("a graduated student");
        }
    }
}
class Person {
    protected String name="person";
    protected int age=50;

    public String getInfo() {
        return "Name: "+ name + "\n" +"age: "+ age;
    }
}
class Student extends Person {
    protected String school="pku";

    @Override
    public String getInfo() {
        return  "Name: "+ name + "\nage: "+ age
                + "\nschool: "+ school;
    }
}
class Graduate extends Student{
    public String major="IT";

    @Override
    public String getInfo() {
        return  "Name: "+ name + "\nage: "+ age
                + "\nschool: "+ school+"\nmajor:"+major;
    }
}
