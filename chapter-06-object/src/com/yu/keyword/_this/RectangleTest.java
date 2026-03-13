package com.yu.keyword._this;

/**
 *
 *
 * @author Yu
 * @create 2026-03-13 22:43
 */
public class RectangleTest {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();

        System.out.println("r1对象：" + r1.getInfo());
        System.out.println("r2对象：" + r2.getInfo());

        r1.length = 10;
        r1.width = 2;
        System.out.println("r1对象：" + r1.getInfo());
        System.out.println("r2对象：" + r2.getInfo());

        r1.print('#');
        System.out.println("---------------------");
        r1.print('&');

        System.out.println("---------------------");
        r2.print('#');
        System.out.println("---------------------");
        r2.print('%');
    }
}

class Rectangle {
    int length;
    int width;

    public int area() {
        return this.length * this.width;
    }

    public int perimeter() {
        return 2 * (this.length + this.width);
    }

    public void print(char sign) {
        for (int i = 1; i <= this.width; i++) {
            for (int j = 1; j <= this.length; j++) {
                System.out.print(sign);
            }
            System.out.println();
        }
    }

    public String getInfo() {
        return "长：" + this.length + "，宽：" + this.width + "，面积：" + this.area() + "，周长：" + this.perimeter();
    }
}
