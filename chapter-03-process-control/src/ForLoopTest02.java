/**
 * for循环练习2
 * 打印1~100之间所有是7的倍数的整数的个数及总和（体会设置计数器的思想）
 *
 * @author Yu
 * @create 2026-03-09 21:12
 */
public class ForLoopTest02 {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            if (i % 7 == 0) {
                sum+=i;
                count++;
            }
        }
        System.out.println("1~100之间所有是7的倍数的整数的和为：" + sum);
        System.out.println("1~100之间所有是7的倍数的整数的个数为：" + count);
    }
}
