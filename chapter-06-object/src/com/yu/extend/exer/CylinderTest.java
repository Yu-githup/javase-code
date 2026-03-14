package com.yu.extend.exer;

/**
 * 继承练习3测试类
 *
 * @author Yu
 * @create 2026-03-14 23:38
 */
public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        cylinder.setLength(5);
        cylinder.setRadius(3);
        double volume = cylinder.findVolume();
        System.out.println("圆柱的体积为：" + volume);
    }
}
