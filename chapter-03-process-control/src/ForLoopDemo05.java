/**
 * for循环案例5+break
 * 说明：输入两个正整数m和n，求其最大公约数和最小公倍数。
 *
 * 比如：12和20的最大公约数是4，最小公倍数是60。
 * 约数：12为例，约数有1,2,3,4,6,12
 *       20为例，约数有1,2,4,5,10,20
 * 倍数：12为例，倍数有12,24,36,48,60,72,....
 *       20为例，倍数有20,40,60,80,....
 *
 * @author Yu
 * @create 2026-03-09 21:09
 */
public class ForLoopDemo05 {
    public static void main(String[] args) {
        int m = 12;
        int n = 20;

        // 需求1：最大公约数
        int min = (m < n) ? m : n; // 获取最小值
        for (int i = min; i >= 1; i--) {
            if (m % i == 0 && n % i == 0) {
                System.out.println("最大公约数是：" + i); // 公约数
                break;
            }
        }

        // 需求2：最小公倍数
        int max = (m > n) ? m : n; // 获取较大值
        for (int i = max; i < m * n; i++) {
            if (i % m == 0 && i % n == 0) {
                System.out.println("最小公倍数是：" + i);// 公倍数
                break;
            }
        }
    }
}
