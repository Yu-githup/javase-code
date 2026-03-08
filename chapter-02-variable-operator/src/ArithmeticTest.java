/**
 * 算术运算符练习
 *
 * @author Yu
 * @create 2026-03-08 22:28
 */
public class ArithmeticTest {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        System.out.println(a + b); // 7
        System.out.println(a - b); // -1
        System.out.println(a * b); // 12
        System.out.println(a / b); // 计算机结果是 0，为什么不是 0.75 呢？
        System.out.println(a % b); // 3

        // 结果与被模数符号相同
        System.out.println(5 % 2); // 1
        System.out.println(5 % -2); // 1
        System.out.println(-5 % 2); // -1
        System.out.println(-5 % -2); // -1

        // 商*除数 + 余数 = 被除数
        // 5%-2 ==>商是-2，余数时 1 (-2)*(-2)+1 = 5
        // -5%2 ==>商是-2，余数是-1 (-2)*2+(-1) = -4-1=-5
    }
}
