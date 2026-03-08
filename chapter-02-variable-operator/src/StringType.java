/**
 * 字符串类型的使用
 *
 * @author Yu
 * @create 2026-03-08 22:11
 */
public class StringType {
    public static void main(String[] args) {
        // 输出：12
        System.out.println("" + 1 + 2);

        int num = 10;
        boolean b1 = true;
        String s1 = "abc";
        String s2 = s1 + num + b1;
        // 输出：abc10true
        System.out.println(s2);

        // String s3 = num + b1 + s1;// 编译不通过，因为int类型不能与boolean运算
        // 编译通过(可以和String类型运算)
        String s4 = num + (b1 + s1);

        String str = "123";
        // int num1 = (int)str;// 错误的,String不可以使用7大基本数据类型转换的方式

        // TODO 正确的，后面才能讲到，借助包装类的方法才能转
        int num2 = Integer.parseInt(str);
    }
}
