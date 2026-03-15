package com.yu.keyword._object.exer;

/**
 * 圆
 *
 * @author Yu
 * @create 2026-03-15 23:44
 */
public class Circle extends GeometricObject{
    private double radius;
    public Circle(){
        radius = 1.0;
    }

    public Circle(double radius) {
        this();
        this.radius = radius;
    }

    public Circle(double radius, String color, double weight) {
        this(radius);
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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }

        Circle circle = (Circle) obj;
        return this.radius == circle.radius;
    }


    @Override
    public String toString() {
        return "圆的半径为：" + radius;
    }
}
