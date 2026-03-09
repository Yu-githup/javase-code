/**
 * 优化3
 *
 * @author Yu
 * @create 2026-03-09 22:22
 */
public class BreakContinueDemo03 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis(); //记录当前时间距离1970-1-1 00:00:00的毫秒数

        int count = 0;// 记录质数的个数

        label:for (int i = 2; i <= 100000; i++) { // i
            for (int j = 2; j <= Math.sqrt(i); j++) { // 优化2：将循环条件中的i改为Math.sqrt(i)
                if (i % j == 0) { // 表明i有约数,则跳过本次循环
                    continue label;
                }
            }

            // 一旦程序执行到这个位置,说明i就是越数
            System.out.println(i);
            count++;
        }
        long end = System.currentTimeMillis();
        System.out.println("质数的个数为：" + count);
        System.out.println("执行此程序花费的毫秒数为：" + (end - start));
    }
}
