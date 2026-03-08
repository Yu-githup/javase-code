/**
 * 字符类型使用
 *
 * @author Yu
 * @create 2026-03-08 21:48
 */
public class CharDataType {
    public static void main(String[] args) {
        char c1 = 'a';
        char c2 = '中';
        char c3 =  '9';
        char c4 =  '%';
        char c5 = 'γ';
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
        // 编译不通过
        // char c6 = ''; 有且仅有一个字符
        // char c7 = 'ab';

        // \u0023 表示 '#'。
        char c6 =  '\u0023';
        System.out.println(c6);

        // '\n'表示换行符
        char c7 = '\n';
        System.out.println("hello" + c7 + "world");

        char c8 = 97;
        System.out.println(c8);// a

        char c9 = '1';
        char c10 = 1;
        // 使用Unicode码对应的数值进行计算,自动提升为int类型进行计算
        System.out.println(c9 + c10);
    }
}
