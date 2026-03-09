/**
 * switch案例3
 * 使用switch-case实现：对学生成绩大于60分的，输出“合格”。低于60分的，输出“不合格”。
 *
 * @author Yu
 * @create 2026-03-09 20:42
 */
public class SwitchCaseDemo03 {
    public static void main(String[] args) {
        int score = 101;
        String level;

        if (score < 0 || score > 100){
            System.out.println("输入的成绩不合法");
            System.exit(0);
        }

        // 写法1：及其不推荐
        switch (score) {
            case 0:
                level = "不及格";
                break;
            case 1:
            case 2:
                // ...
            case 100:
        }

        // 写法2：优化写法1
        switch (score / 10) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                level = "不及格";
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                level = "及格";
                break;
            default:
                level = "非法的";
                break;
        }

        System.out.println(level);

        // 写法3：优化写法2（推荐）
        switch (score / 60) {
            case 0:
                level = "不及格";
                break;
            case 1:
                level = "及格";
                break;
            default:
                level = "非法的";
                break;
        }
        System.out.println(level);
    }
}
