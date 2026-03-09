/**
 * do-while循环案例1
 * 遍历1-100的偶数，并计算所有偶数的和、偶数的个数（累加的思想）
 *
 * @author Yu
 * @create 2026-03-09 22:01
 */
public class DoWhileLoopDemo01 {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        int i = 1;

        do {
            if (i % 2 == 0) {
                sum += i;
                count++;
            }
            i++;
        } while (i <= 100);

        System.out.println("偶数的总和为：" + sum);
        System.out.println("偶数的个数为：" + count);
    }
}
