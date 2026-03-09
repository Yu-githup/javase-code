/**
 * if练习6
 * 编写程序，声明2个double型变量并赋值。
 * 判断第一个数大于10.0，且第2个数小于20.0，打印两数之和。
 * 否则，打印两数的乘积。
 *
 * @author Yu
 * @create 2026-03-09 20:28
 */
public class IFElseTest06 {
    public static void main(String[] args) {
        double num1 = 13.0;
        double num2 = 20.0;

        if (num1 > 10.0 && num2 < 20.0){
            System.out.println("两数之和为：" + num1 + num2);
        }else {
            System.out.println("两数之积为：" + num1 * num2);
        }
    }
}
