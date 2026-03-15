package com.yu.polymorphism.exer;

/**
 * 圆
 *
 * @author Yu
 * @create 2026-03-15 22:41
 */
public class Circle extends GeometricObject{
    private double radius;

    public Circle(double radius,String color ,double weight){
        super(color, weight);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double findArea() {
        return Math.PI * radius * radius;
    }
}
