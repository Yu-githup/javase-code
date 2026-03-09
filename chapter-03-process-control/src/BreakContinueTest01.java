/**
 * break和continue练习1
 * 生成 1-100 之间的随机数，直到生成了 97 这个数，看看一共用了几次？
 *
 * 提示：使用 (int)(Math.random() * 100) + 1
 *
 * @author Yu
 * @create 2026-03-09 22:23
 */
public class BreakContinueTest01 {
    public static void main(String[] args) {
        // 记录循环的次数（或生成随机数进行比较的次数）
        int count = 0;
        while (true) {
            int num = (int)(Math.random() * 100) + 1;
            System.out.println(num);
            if (num == 97) {
                break;
            }
            count++;
        }
        System.out.println("直到生成随机数97，一共比较了" + count + "次");
    }
}
