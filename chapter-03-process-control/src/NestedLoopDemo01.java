/**
 * 嵌套循环案例1
 * 打印5行6个*
 *
 * @author Yu
 * @create 2026-03-09 22:08
 */
public class NestedLoopDemo01 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
