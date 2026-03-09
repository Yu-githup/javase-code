import java.util.Scanner;

/**
 * switch练习1
 * 从键盘输入星期的整数值，输出星期的英文单词
 *
 * @author Yu
 * @create 2026-03-09 20:51
 */
public class SwitchCaseTest01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        String str;
        switch (num){
            case 1:
                str = "Monday";
                break;
            case 2:
                str = "Tuesday";
                break;
            case 3:
                str = "Wednesday";
                break;
            case 4:
                str = "Thursday";
                break;
            case 5:
                str = "Friday";
                break;
            case 6:
                str = "Saturday";
                break;
            case 7:
                str = "Sunday";
                break;
            default:
                str = "你输入的星期值有误！";
                break;
        }

        System.out.println(str);
        scanner.close();
    }
}
