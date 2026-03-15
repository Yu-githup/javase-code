package com.yu.keyword._object.exer;

/**
 * 测试
 *
 * @author Yu
 * @create 2026-03-15 23:51
 */
public class GeometricObjectTest {
    public static void main(String[] args) {
        Circle c1 = new Circle(1,"red",1);
        Circle c2 = new Circle(2,"red",1);
        System.out.println(c1.equals(c2));
        System.out.println(c1);
        System.out.println(c2);
    }
}
