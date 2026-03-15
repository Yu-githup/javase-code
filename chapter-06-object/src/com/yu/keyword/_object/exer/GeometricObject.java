package com.yu.keyword._object.exer;

/**
 * toString方法练习
 *
 * @author Yu
 * @create 2026-03-15 23:44
 */
public class GeometricObject {
    protected String color;
    protected double weight;

    protected GeometricObject(){
        this.color = "white";
        this.weight = 1.0;
    }

    protected GeometricObject(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
