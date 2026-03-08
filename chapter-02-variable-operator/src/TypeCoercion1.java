/**
 * 强制类型转换练习
 *
 * @author Yu
 * @create 2026-03-08 22:09
 */
public class TypeCoercion1 {
    public static void main(String[] args) {
        short b1 = 120;
        short b2 = 8;
        // byte b3 = (byte)128
        byte b3 = (byte)(b1 + b2);
        //编译通过，结果是-128
        System.out.println(b3);
    }
}
