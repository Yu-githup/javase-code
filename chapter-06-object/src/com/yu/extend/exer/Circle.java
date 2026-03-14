package com.yu.extend.exer;

/**
 * 继承练习3
 *
 * @author Yu
 * @create 2026-03-14 23:31
 */
public class Circle {
    private double radius;

    public Circle(){
        this.radius = 1;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double findArea(){
        return Math.PI * radius * radius;
    }
}
