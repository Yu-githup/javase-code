/**
 * 代码题5
 *
 * @author Yu
 * @create 2026-03-08 22:46
 */
public class CodeQuestion5 {
    public static void main(String[] args) {
        byte b1 = 10, b2 = 20;
        byte b3 = (byte) (b1 + b2);
        System.out.println("byte类型的b1和b2的和为：");
        System.out.println(b3);

        short s1 = 1000, s2 = 2000;
        short s3 = (short) (s1 + s2);
        System.out.println("short类型的s1和s2的和为：");
        System.out.println(s3);

        char ch1 = 'a'; // 97
        int i1 = 30;
        int ch3 = ch1 - i1;
        System.out.println("char类型的ch1和int类型的i1的差：");
        System.out.println(ch3);
    }
}
