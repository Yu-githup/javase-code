package com.yu.polymorphism.exer;

/**
 * 矩形
 *
 * @author Yu
 * @create 2026-03-15 22:41
 */
public class MyRectangle extends GeometricObject{
    private double width;
    private double height;

    public MyRectangle(double width, double height, String color,double weight) {
        super(color,weight);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double findArea(){
        return width * height;
    }
}
