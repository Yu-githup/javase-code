/**
 * 嵌套循环案例3：打印5行倒直角三角形
 *
 * @author Yu
 * @create 2026-03-09 22:10
 */
public class NestedLoopDemo03 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
