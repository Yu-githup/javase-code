package method_exer;

/**
 * 练习2
 *
 * @author Yu
 * @create 2026-03-11 22:56
 */
public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.radius = 3;
        double area = c1.area();
        System.out.println("圆的面积为: " + area);
    }
}

class Circle {
    // 半径
    double radius;

    public double area() {
        return 3.14 * radius * radius;
    }

}