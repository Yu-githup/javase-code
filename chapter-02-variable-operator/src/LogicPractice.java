/**
 * 逻辑运算符练习
 *
 * @author Yu
 * @create 2026-03-08 22:52
 */
public class LogicPractice {
    public static void main(String[] args) {
        int a = 20;
        int b = 20;
        boolean bo1 = ((++a % 3) == 0) && ((a++ % 7) == 0);
        System.out.println("bo1的值：" + bo1);
        System.out.println("a的值：" + a);
        System.out.println("----------------------------");

        boolean bo2 = ((b++ % 3) == 0) && ((++b % 7) == 0);
        System.out.println("bo2的值：" + bo2);
        System.out.println("b的值：" + b);
    }
}
