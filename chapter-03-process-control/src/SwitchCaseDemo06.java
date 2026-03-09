import java.util.Scanner;

/**
 * switch案例6
 * 从键盘输入一个整数，判断是正数、负数、还是零。
 *
 * @author Yu
 * @create 2026-03-09 20:50
 */
public class SwitchCaseDemo06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num > 0) {
            System.out.println("正数");
        } else if (num < 0) {
            System.out.println("负数");
        }else {
            System.out.println("零");
        }

        scanner.close();
    }
}
