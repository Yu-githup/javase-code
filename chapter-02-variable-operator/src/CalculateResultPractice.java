/**
 * 自动类型提升练习
 *
 * @author Yu
 * @create 2026-03-08 22:00
 */
public class CalculateResultPractice {
    public static void main(String[] args) {
        /*判断如下代码是否编译通过，如果能，结果是多少？*/
        short s1 = 120;
        short s2 = 8;
        // short s3 = s1 + s2; 编译不通过。因为s1+s2自动提示为int类型
        int s3 = s1 + s2;
        System.out.println(s3);


        // -------------------------------------------------------
        char c1 = '0';
        char c2 = '1';
        // char c3 = c1 + c2; 编译不通过。因为c1+c2自动提升为int类型

        System.out.println(c1 + 0); // '0' 对应的数值为48
        System.out.println(c2 + 0); // '1' 对应的数值为49

        // 编译通过，println方法可以接收各种数据类型的值，进行输出，结果是97  ===>  int类型
        System.out.println(c1 + c2);

        // 说明在进行计算时,char类型字符会对应Unicode编码表,将字符转换为数值,然后进行计算，再使用int类型接收


        // -------------------------------------------------------
        int i = 4;
        long j = 120;  //自动类型提升
        double d = 34; //自动类型提升
        // float f = 1.2; 编译不通过,因为1.2默认是double类型,float类型需要加F,或者f。要么加(float)1.2
        double num = i + j + d;
        System.out.println(num);


        // -------------------------------------------------------
        int a = 1;
        int b = 2;
        double result = a / b;
        System.out.println(result);
        // 编译通过，结果是0.0，先计算a/b结果是0，然后提升double,0.0
    }
}
