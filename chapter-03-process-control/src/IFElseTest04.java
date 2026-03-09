/**
 * if练习4
 * 小明参加期末Java考试，通过考试成绩，判断其Java等级，成绩范围[0,100]
 * - 90-100      优秀
 * - 80-89        好
 * - 70-79        良
 * - 60-69        及格
 * - 60以下       不及格
 *
 * @author Yu
 * @create 2026-03-09 20:26
 */
public class IFElseTest04 {
    public static void main(String[] args) {
        int score = 99;
        String level;

        if (score < 0 || score > 100){
            System.out.println("输入的成绩不合法");
            System.exit(0); // 结束程序
            // throw  new RuntimeException("输入的成绩有误"); // 异常章节说明
        }

        // 写法1
        if (score >= 90 && score <= 100){
            level = "优秀";
        } else if (score >= 80 && score <= 89) {
            level = "好";
        } else if (score >= 70 && score <= 79) {
            level = "良";
        } else if (score >= 60 && score <= 69) {
            level = "及格";
        }else {
            level = "不及格";
        }
        System.out.println("小明的考试等级为：" + level);

        // 写法2：不能更改执行顺序
        if (score >= 90) {
            level = "优秀";
        } else if (score >= 80) {
            level = "好";
        } else if (score >= 70) {
            level = "良";
        } else if (score >= 60) {
            level = "及格";
        } else {
            level = "不及格";
        }
        System.out.println("小明的考试等级为：" + level);
    }
}
