/**
 * 获取指定位置上的值
 *
 * @author Yu
 * @create 2026-03-08 22:33
 */
public class GetTheSpecifiedValue01Practice {
    public static void main(String[] args) {
        // 1.定义一个变量，赋值为一个四位数整数，例如 1234
        int num = 1234;

        // 2.通过运算操作求出个位，十位，百位，千位
        int ge = num % 10;
        int shi = num /10 % 10;
        int bai = num /100 % 10;
        int qian = num / 1000 % 10;
        // 3.控制台打印
        System.out.println("个位上的数字是：" + ge);
        System.out.println("十位上的数字是：" + shi);
        System.out.println("百位上的数字是：" + bai);
        System.out.println("千位上的数字是：" + qian);
    }
}
