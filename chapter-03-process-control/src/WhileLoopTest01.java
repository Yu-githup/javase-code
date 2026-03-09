import java.util.Scanner;

/**
 * while循环练习1
 * 从键盘输入整数，输入0结束，统计输入的正数、负数的个数。
 *
 * @author Yu
 * @create 2026-03-09 21:36
 */
public class WhileLoopTest01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int positiveCount = 0; // 正数个数
        int negativeCount = 0; // 负数个数

        boolean isFlag = true;
        while (isFlag) {
            int num = scan.nextInt();
            if (num > 0) {
                positiveCount++;
            } else if (num < 0) {
                negativeCount++;
            } else {
                isFlag = false;
            }
        }
        System.out.println("正数个数为：" + positiveCount);
        System.out.println("负数个数为：" + negativeCount);
        scan.close();
    }
}
