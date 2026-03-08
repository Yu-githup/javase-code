/**
 * 数据类型
 *
 * @author Yu
 * @create 2026-03-08 21:31
 */
public class DataType {
    public static void main(String[] args) {
        // 整数类型
        int num = 1;
        long num1 = 1l;
        long num2 = 123L;
        short num3 = 3;

        // 浮点类型
        // 1、十进制数形式
        float f1 = 5.12F; // float需要末尾加上f或者F
        double f2 = 5.12;
        double f3 = .512; // 必须有小数点

        // 2、科学计数法形式
        float f4 = 5.12e2F;
        double f5 = 512E2;
        double f6 = 100e-2;

        // 测试1：为什么0.1 + 0.2不等于0.3?  (所有的编程语言都如此)
        // 结果：0.30000000000000004
        System.out.println(0.1 + 0.2);

        // 测试2：
        float ff1 = 123123123f;
        float ff2 = ff1 + 1;
        // 1.2312312E8
        System.out.println(ff1);
        // 1.2312312E8
        System.out.println(ff2);
        // true
        System.out.println(ff1 == ff2);
    }
}
