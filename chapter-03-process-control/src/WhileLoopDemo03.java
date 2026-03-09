import java.util.Scanner;

/**
 * while循环案例3
 * 随机生成一个100以内的数，猜这个随机数是多少？
 * 从键盘输入数，如果大了，提示大了；如果小了，提示小了；如果对了，就不再猜了，并统计一共猜了多少次。
 * 提示：生成一个[a,b] 范围的随机数的方式：(int)(Math.random() * (b - a + 1) + a)
 *
 * @author Yu
 * @create 2026-03-09 21:33
 */
public class WhileLoopDemo03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = (int) (Math.random() * (100 - 1 + 1) + 1);
        int count = 0;
        System.out.println("随机数已生成，请输入你猜测的数值(1-100)：");
        while (true) {
            int number = scanner.nextInt();
            if (number < num) {
                System.out.println("不好意思你猜小了");
                count++;
            } else if (number > num) {
                System.out.println("不好意思你猜大了");
                count++;
            } else {
                System.out.println("恭喜你！猜中了，总共猜了" + count + "次");
                scanner.close();
                System.exit(0);
            }
            System.out.println("重猜吧：");
        }
    }
}
