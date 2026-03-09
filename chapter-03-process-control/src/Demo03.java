import java.util.Scanner;

/**
 * 章节案例：成绩合法范围判断
 *
 * @author Yu
 * @create 2026-03-09 22:32
 */
public class Demo03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入成绩：");
        int score = input.nextInt();

        if(score <0 || score > 100){
            System.out.println("成绩输入有误！");
        }else {
            System.out.println("成绩为：" + score);
        }

        input.close();
    }
}
