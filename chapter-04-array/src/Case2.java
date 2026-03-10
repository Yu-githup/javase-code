import java.util.Scanner;

/**
 * 一维数组案例2
 * 用一个数组，保存星期一到星期天的7个英语单词，从键盘输入1-7，显示对应的单词
 * {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"}
 *
 * @author Yu
 * @create 2026-03-10 19:24
 */
public class Case2 {
    public static void main(String[] args) {
        // 1、声明并初始化星期的数组
        String[] weeks = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

        // 2、使用Scanner从键盘获取1-7范围的整数
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入[1-7]范围的整数：");
        int number = scanner.nextInt();

        // 3、判断输入是否合法
        if (number < 1 || number > 7) {
            System.out.println("你的输入整数非法");
        }else {
            // 4、根据输入的整数，到数组中相应的索引位置获取指定的元素（即：星期几）
            System.out.println("对应的星期为：" + weeks[number - 1]);

        }

        // 5、关流
        scanner.close();
    }
}
