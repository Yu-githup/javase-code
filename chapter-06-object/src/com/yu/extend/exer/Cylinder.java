package com.yu.extend.exer;

/**
 * 继承练习3
 *
 * @author Yu
 * @create 2026-03-14 23:31
 */
public class Cylinder extends Circle{
    private double length;

    public Cylinder(){
        this.length = 1;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double findVolume() {
        return findArea() * length;
    }
}
