import java.util.Scanner;

/**
 * 一维数组案例3
 * 用一个数组，保存12个月的英语单词，从键盘输入1-12，显示对应的单词。
 * {"January","February","March","April","May","June","July","August","September","October","November","December"}
 *
 * @author Yu
 * @create 2026-03-10 19:29
 */
public class Case3 {
    public static void main(String[] args) {
        // 1. 声明月份
        String[] months = {"January","February","March","April","May","June","July","August","September","October","November","December"};

        // 2. 获取扫描仪
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        // 3. 判断输入的合法性
        if (num < 1 || num > 12) {
            System.out.println("输入的整数不合法");
        }else {
            System.out.println(months[num - 1]);
        }

        // 4. 关闭扫描仪
        scanner.close();
    }
}
