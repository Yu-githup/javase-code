package com.yu.extend;

import java.util.Date;

/**
 * Java中的继承
 *
 * @author Yu
 * @create 2026-03-14 22:48
 */
public class StudentExtendPerson {
}

class Person1{
    public String name;
    public int age;
    public Date birthday;

    public String getInfo(){
        return "";
    }
}

class Student1 extends Person1 {
    public String school;

    //@Override
    public String getInfo(){
        return "";
    }
}
