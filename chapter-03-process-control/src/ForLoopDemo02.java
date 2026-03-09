/**
 * for循环案例2
 * for循坏的多样性
 *
 * @author Yu
 * @create 2026-03-09 21:04
 */
public class ForLoopDemo02 {
    public static void main(String[] args) {
        int num = 1;
        for(System.out.print("a");num < 3;System.out.print("c"),num++){
            System.out.print("b");
        }
        // 输出abcbc
    }
}
