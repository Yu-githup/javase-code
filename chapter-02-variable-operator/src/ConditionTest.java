/**
 * 条件运算符
 *
 * @author Yu
 * @create 2026-03-08 22:57
 */
public class ConditionTest {
    public static void main(String[] args) {
        int i = (1==2 ? 100 : 200);
        System.out.println(i);// 200

        boolean marry = false;
        System.out.println(marry ? "已婚" : "未婚"  ); // 未婚

        double m1 = 2.3;
        double m2 = 1.3;
        double d1 = (m1 > m2)? 1 : 2.0;
        System.out.println(d1); // 1.0（自动类型提升）

        int num = 12;
        System.out.println(num > 0? true : "num非正数"); // ture
    }
}
