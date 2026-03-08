/**
 * 变量赋值
 *
 * @author Yu
 * @create 2026-03-08 21:24
 */
public class VariableSetValue2 {
    public static void main(String[] args) {
        int age = 18;
        int weight = 109;
        char gender = '女';

        int m = 1;
        // 使用其他变量给n赋值
        int n = m;

        int x = 1;
        int y = 2;
        // 使用表达式给变量赋值
        int z = 2 * x + y;

        boolean isBeauty = true;
        String name = "张三";

        //先声明，后初始化
        char gender1;
        gender1 = '女';

        //给变量重新赋值，修改gender变量的值
        gender = '男';
        //gender = 男
        System.out.println("gender = " + gender);
    }
}
