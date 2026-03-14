package com.yu.extend.exer;

/**
 * 继承练习1
 *
 * @author Yu
 * @create 2026-03-14 23:10
 */
public class Student extends Person{
    long number;
    int math;
    int english;
    int computer;

    public Student(String n, char g,int a,long m,int e,int c) {
        name = n;
        gender = g;
        age = a;
        number = m;
        english = e;
        computer = c;
    }

    public double aver(){
        return 0.0;
    }

    public int max() {
        return 0;
    }

    public int min(){
        return 0;
    }
}
