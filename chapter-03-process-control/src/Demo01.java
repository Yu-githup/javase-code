import java.util.Scanner;

/**
 * 章节案例1:判断奇数偶数
 * 案例：从键盘输入一个整数，判断它是奇数还是偶数（这里把0归为偶数）
 * 说明：能够被2整除的是偶数，不能被2整除的是奇数
 *
 * @author Yu
 * @create 2026-03-09 22:29
 */
public class Demo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + "是偶数");
        }else {
            System.out.println(num + "是奇数");
        }

        scanner.close();
    }
}
