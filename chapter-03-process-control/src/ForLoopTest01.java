/**
 * for循环练习1
 * 打印1~100之间所有奇数的和
 *
 * @author Yu
 * @create 2026-03-09 21:11
 */
public class ForLoopTest01 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                sum+=i;
            }
        }
        System.out.println("奇数总和为：" + sum);
    }
}
