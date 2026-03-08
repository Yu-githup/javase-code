/**
 * 算术运算符的练习
 *
 * @author Yu
 * @create 2026-03-08 22:35
 */
public class ArithmeticPractice {
    public static void main(String[] args) {
        int i1 = 10;
        int i2 = 20;
        int i = i1++;
        System.out.print("i="+i + "\t"); // 10
        System.out.println("i1="+i1);// 11

        i = ++i1;
        System.out.print("i="+i + "\t");// 12
        System.out.println("i1="+i1);// 12

        i = i2--;
        System.out.print("i="+i + "\t");// 20
        System.out.println("i2="+i2);// 19

        i = --i2;
        System.out.print("i="+i + "\t");// 18
        System.out.println("i2="+i2);// 18
    }
}
