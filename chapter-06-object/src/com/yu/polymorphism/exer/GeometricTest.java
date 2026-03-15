package com.yu.polymorphism.exer;

/**
 * 测试类
 *
 * @author Yu
 * @create 2026-03-15 22:42
 */
public class GeometricTest {
    public static void main(String[] args) {
        Circle c1  = new Circle(1,"red", 1);
        MyRectangle m1 = new MyRectangle(3,4,"red",2);

        GeometricTest geo = new GeometricTest();
        geo.displayGeometricObject(c1);
        geo.displayGeometricObject(m1);

        boolean b = geo.equalsArea(c1, m1);
        System.out.println("是否相等：" + b);
    }

    // 判断面积是否相等
    public boolean equalsArea(GeometricObject g1,GeometricObject g2) {
        double area1 = g1.findArea();
        double area2 = g2.findArea();
        return area1==area2?true:false;
    }

    // 显示面积
    public void displayGeometricObject(GeometricObject geo) {
        System.out.println("面积为：" + geo.findArea());
    }
}
