import java.util.Scanner;

/**
 * do-while练习1
 * 随机生成一个100以内的数，猜这个随机数是多少？
 * 从键盘输入数，如果大了提示，大了；如果小了，提示小了；如果对了，就不再猜了，并统计一共猜了多少次。
 *
 * @author Yu
 * @create 2026-03-09 22:03
 */
public class DoWhileLoopTest01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = (int) (Math.random() * 100) + 1;
        System.out.println("随机数已生成，请输入你要猜测的数值：");
        int i;
        int count = 0;

        do {
            i = scanner.nextInt();
            if (i > num) {
                System.out.println("猜大了");
                count++;
            } else if (i < num) {
                System.out.println("猜小了");
                count++;
            }

        } while (num != i);

        System.out.println("恭喜你,猜了" + count + "次,终于猜对了！！！");
        scanner.close();
    }
}
