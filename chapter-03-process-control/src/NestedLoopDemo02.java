/**
 * 嵌套循环案例2
 * 打印5行直角三角形
 *
 * @author Yu
 * @create 2026-03-09 22:09
 */
public class NestedLoopDemo02 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
