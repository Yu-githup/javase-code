/**
 * while循环案例2
 * 遍历1-100的偶数，并计算所有偶数的和、偶数的个数（累加的思想）
 *
 * @author Yu
 * @create 2026-03-09 21:32
 */
public class WhileLoopDemo02 {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;

        int i = 1;
        while (i <= 100) {
            if (i % 2 == 0) {
                sum += i;
                count++;
            }
            i++;
        }

        System.out.println("100以内偶数个数为：" + count);
        System.out.println("100以内偶数总和为：" + sum);
    }
}
