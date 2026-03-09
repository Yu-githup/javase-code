/**
 * do-while循环案例2
 *
 * @author Yu
 * @create 2026-03-09 22:01
 */
public class DoWhileLoopDemo02 {
    public static void main(String[] args) {
        // while循环
        int num1 = 10;
        while (num1 > 10) {
            System.out.println("hello:while");
            num1--;
        }

        // do-while循环
        int num2 = 10;
        do {
            System.out.println("hello:do-while");
            num2--;
        }while (num2 > 10);
    }
}
