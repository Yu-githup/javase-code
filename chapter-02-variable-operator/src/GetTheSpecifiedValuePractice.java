/**
 * 算术运算符练习：获取指定值
 * 随意给出一个整数，打印显示它的个位数，十位数，百位数的值。
 * 格式如下：
 * 数字xxx的情况如下：
 * 个位数：
 * 十位数：
 * 百位数：
 * -----------------------
 * 例如：
 * 数字153的情况如下：
 * 个位数：3
 * 十位数：5
 * 百位数：1
 *
 * @author Yu
 * @create 2026-03-08 22:32
 */
public class GetTheSpecifiedValuePractice {
    public static void main(String[] args) {
        int num = 187;
        int bai = num / 100;
        int shi = num / 10 % 10;  // int shi = num % 100 / 10;
        int ge = num % 10;

        System.out.println("百位为：" + bai);
        System.out.println("十位为：" + shi);
        System.out.println("个位为：" + ge);
    }
}
