import java.util.Scanner;

/**
 * 章节案例2：字符类型判断
 * 案例：从键盘输入一个字符，判断它是字母还是数字，还是其他字符
 * 数字范围：'0'-'9'    字母范围：'A'-'Z'，'a'-'z'
 *
 * @author Yu
 * @create 2026-03-09 22:31
 */
public class Demo02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char c = scanner.next().charAt(0);
        if (c >= '0' && c <= '9') {
            System.out.println(c + "是数字.");
        } else if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {
            System.out.println(c + "是字母.");
        } else {
            System.out.println(c + "非数字非字母的其他字符");
        }
        scanner.close();
    }
}
