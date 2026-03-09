/**
 * if案例4
 * ：**由键盘输入三个整数分别存入变量num1、num2、num3，对它们进行排序(使用 if-else if-else)，并且从小到大输出。
 *
 * @author Yu
 * @create 2026-03-09 20:22
 */
public class IFElseDemo04 {
    public static void main(String[] args) {
        // 声明三个变量
        int num1 = 23, num2 = 32,num3 = 12;

        // 排序操作
        if (num1 >= num2){
            if (num3 >= num1){
                System.out.println(num2 + "-" + num1 + "-" + num3);
            } else if (num3 >= num2) {
                System.out.println(num2 + "-" + num3 + "-" + num1);
            }else if (num3 <= num2){
                System.out.println(num3 + "-" + num2 + "-" + num1);
            }
        } else { // num1 < num2
            if (num3 <= num1){
                System.out.println(num3 + "-" + num1 + "-" + num2);
            } else if (num3 <= num2) {
                System.out.println(num1 + "-" + num3 + "-" + num2);
            } else if (num3 >= num2) {
                System.out.println(num1 + "-" + num2 + "-" + num3);
            }
        }
    }
}
