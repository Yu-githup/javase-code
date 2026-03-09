import java.util.Scanner;

/**
 * switch练习3
 * 编写程序：从键盘上读入一个学生成绩，存放在变量score中，根据score的值输出其对应的成绩等级：
 *
 * score>=90           等级:  A
 * 70<=score<90        等级:  B
 * 60<=score<70        等级:  C
 * score<60            等级:  D
 *
 * 方式一：使用if-else
 * 方式二：使用switch-case:  score / 10:   0 - 10
 *
 * @author Yu
 * @create 2026-03-09 20:53
 */
public class SwitchCaseTest03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        if (score < 0 || score > 100){
            System.out.println("输入成绩不合法");
            System.exit(0);
        }
        String level;

        // 方式1：if-else
        if (score >= 90) {
            level = "A";
        } else if (score >= 70 && score < 90) {
            level = "B";
        } else if (score >= 60 && score < 70) {
            level = "C";
        }else {
            level = "D";
        }
        System.out.println("学生成绩为："+ score +",对应的等级为：" + level);

        // 方式2：switch-case
        switch (score / 10){
            case 10:
            case 9:
                level = "A";
                break;
            case 8:
            case 7:
                level = "B";
                break;
            case 6:
                level = "C";
                break;
            default :
                level = "D";
        }
        System.out.println("学生成绩为："+ score +",对应的等级为：" + level);
        scanner.close();
    }
}
