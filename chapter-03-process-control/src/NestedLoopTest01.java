/**
 * 嵌套循环练习1
 * 将一天中的时间打印到控制台
 *
 * @author Yu
 * @create 2026-03-09 22:13
 */
public class NestedLoopTest01 {
    public static void main(String[] args) {
        for (int i = 0; i < 24; i++) {
            for (int j = 0; j < 60; j++) {
                for (int k = 0; k < 60; k++) {
                    System.out.println(i + ":" + j + ":" + k);
                }
            }
        }
    }
}
