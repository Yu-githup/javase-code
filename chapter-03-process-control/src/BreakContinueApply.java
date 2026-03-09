/**
 * break和continue关键字的使用
 *
 * @author Yu
 * @create 2026-03-09 22:19
 */
public class BreakContinueApply {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            if (i % 4 == 0) {
                // break; // 123
                continue; // 123567910
                // System.out.println("玩游戏"); // 该语句不能执行,编译不通过
            }
            System.out.print(i);
        }

        // 嵌套循环中的使用
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 10; j++) {
                if (j % 4 == 0) {
                    // break; // 结束的是包裹break关键字的最近的一层循环！
                    continue; // 结束的是包裹break关键字的最近的一层循环的当次！
                }
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
