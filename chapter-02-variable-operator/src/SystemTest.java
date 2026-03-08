/**
 * 进制的测试
 *
 * @author Yu
 * @create 2026-03-08 22:16
 */
public class SystemTest {
    public static void main(String[] args) {
        // 十进制
        int decimal = 0;
        decimal = 1;
        System.out.println("十进制: " + decimal);

        // 二进制(后面只能接0或1)
        int binary = 0b1;
        binary = 0B11111111;
        // binary = 0B2; 编译不通过
        System.out.println("二进制：" + binary);

        // 八进制
        int octal = 01;
        octal = 07;
        // octal = 08; 编译不通过
        System.out.println("八进制：" + octal);

        // 十六进制
        int hex = 0x09;
        hex = 0X23;
        hex = 0XaFFFaabb;
        // hex = 0Xg; 编译不通过
        System.out.println("十六进制：" + hex);
    }
}
