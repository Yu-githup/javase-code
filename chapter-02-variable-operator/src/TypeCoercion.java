/**
 * 强制类型转换
 *
 * @author Yu
 * @create 2026-03-08 22:04
 */
public class TypeCoercion {
    public static void main(String[] args) {
        double d = 3.14;
        int i = (int)d; // 损失精度
        int j = (int) 3.15; // 损失精度

        double d1 = 1.2;
        int num = (int)d;// 损失精度

        int i1 = 200;
        byte b = (byte) i1;// 溢出
        System.out.println(b); // -56

        int i2 = 1;
        int j2 = 2;
        double bigger = (double)(i2 / j2);
        double bigger1 = i2 / j2;
        System.out.println(bigger);
        System.out.println(bigger1);

        long l1 = 123L;
        // 如果省略后缀L或者l，那么次数这个数默认就是int类型，int类型和long类型运算会自动类型提升
        long l2 = 123;

        // long l3 = 123123123123; //报错，因为123123123123超出了int的范围,既不满足自动类型提升,也不是long类型。
        long l4 = 123123123123L;

        // float f1 = 12.3; //报错，因为12.3看做是double，不能自动转换为float类型(与int想反，int是小转大,而double不能大转小)
        float f2 = 12.3F;
        float f3 = (float)12.3;

        // 实际开发中举例
        byte b2 = 12;
        method(b2);

        long ll1 = 12L;
        // method(ll1); 编译不通过,类型不匹配
        method((int) ll1);
    }

    /**
     * int num = b2;自动类型提升（传入的是byte类型，自动提升为int）
     *
     * @param num 数值
     */
    public static void method(int num){
        System.out.println("num = " + num);
    }
}
