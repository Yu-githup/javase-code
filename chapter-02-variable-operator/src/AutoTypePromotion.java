/**
 * 自动类型提升
 *
 * @author Yu
 * @create 2026-03-08 21:55
 */
public class AutoTypePromotion {
    public static void main(String[] args) {
        // char自动升级为int，其实就是把字符的编码值赋值给i变量了
        int i = 'A';
        // int自动升级为double
        double d = 10;
        // 右边的整数常量值如果在int范围呢，编译和运行都可以通过，这里涉及到数据类型转换
        long num = 1234567;

        // byte bigB = 130;//错误，右边的整数常量值超过byte范围
        // 右边的整数常量值如果超过int范围，必须加L，显式表示long类型。否则编译不通过
        long bigNum = 12345678912L;

        //  int count = num + i; 编译不通过,
        long count = num + i;

        int i1 = 1;
        byte b1 = 1;
        double d1 = 1.0;
        // 混合运算，先升级为三者中最大的double,然后再运算
        double sum = i1 + b1 + d1;

        byte bb1 = 1;
        byte bb2 = 2;
        // byte bb3 = bb1 + bb2; 编译报错，b1 + b2自动升级为int
        int bb3 = bb1 + bb2;

        short cc1 = 1;
        char cc2 = 1;
        // char cc3 = cc1 + cc2 + bb1; 编译报错,需要提升为int类型
        int cc3 = cc1 + cc2 + bb1;
    }
}
