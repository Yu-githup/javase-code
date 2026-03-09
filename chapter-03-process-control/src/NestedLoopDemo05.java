/**
 * 嵌套循环案例5：九九乘法表
 *
 * @author Yu
 * @create 2026-03-09 22:12
 */
public class NestedLoopDemo05 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " * " + i + " = " + i * j + "\t");
            }
            System.out.println();
        }
    }
}
