/**
 * 浮点类型练习
 * 定义圆周率并赋值为3.14，现有3个圆的半径分别为1.2、2.5、6，求它们的面积。
 *
 * @author Yu
 * @create 2026-03-08 21:36
 */
public class FloatTypeTest {
    public static void main(String[] args) {
        // 1、圆周率
        double PI = 3.14;

        // 2、定义半径
        double radius1 = 1.2;
        double radius2 = 2.5;
        double radius3 = 6;

        // 3、根据公式计算
        System.out.println("第一个圆的面积：" + (PI * radius1 * radius1));
        System.out.println("第二个圆的面积：" + (PI * radius2 * radius2));
        System.out.println("第三个圆的面积：" + (PI * radius3 * radius3));
    }
}
