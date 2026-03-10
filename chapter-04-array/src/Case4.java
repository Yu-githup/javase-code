import java.util.Scanner;

/**
 * 一维数组案例4
 * 成绩>=最高分-10  等级为’A’
 *
 * 成绩>=最高分-20  等级为’B’
 *
 * 成绩>=最高分-30  等级为’C’
 *
 * 其余            等级为’D’
 *
 * @author Yu
 * @create 2026-03-10 19:30
 */
public class Case4 {
    public static void main(String[] args) {
        // 1. 根据提示，获取学生人数
        System.out.print("请输入学生人数：");
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        // 2. 根据学生人数，创建指定长度的数组 (使用动态初始化)
        int[] scores = new int[count];

        // 3. 使用循环，依次给数组的元素赋值
        int maxScore = 0; // 记录最高分
        System.out.println("请输入" + count + "个成绩");
        for (int i = 0; i < scores.length; i++) {
            scores[i] = scanner.nextInt();
            // 4. 获取数组中元素的最大值，即为最高分
            if(maxScore < scores[i]){
                maxScore = scores[i];
            }
        }

        System.out.println("最高分是：" + maxScore);

        // 5. 遍历数组元素，输出各自的分数，并根据其分数与最高分的差值，获取各自的等级
        char grade;
        for (int i = 0; i < scores.length; i++) {

            if(scores[i] >= maxScore - 10){
                grade = 'A';
            }else if(scores[i] >= maxScore - 20){
                grade = 'B';
            }else if(scores[i] >= maxScore - 30){
                grade = 'C';
            }else{
                grade = 'D';
            }
            System.out.println("student " + i + " score is " + scores[i] + ", grade is " + grade);
        }
        // 6. 关闭资源
        scanner.close();
    }
}
