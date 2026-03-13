package method_value_propagation;

import java.io.PrintStream;

/**
 * 面试题
 *
 * @author Yu
 * @create 2026-03-13 21:08
 */
public class Test {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        //需要在method方法被调用之后,仅打印出a=100,b=200。请写出method方法的代码
        method(a, b);
        System.out.println("a="+a);
        System.out.println("b="+b);
    }

    //法一：
    public static void method(int a, int b) {
        // 在不改变原本题目的前提下，如何写这个函数才能在main函数中输出a=100，b=200？
        a = a * 10;
        b = b * 20;
        System.out.println(a);
        System.out.println(b);
        System.exit(0);
    }


    //法二：
    /*public static void method(int a, int b) {
        PrintStream ps = new PrintStream(System.out) {
            @Override
            public void println(String x) {
                if ("a=10".equals(x)) {
                    x = "a=100";
                } else if ("b=10".equals(x)) {
                    x = "b=200";
                }
                super.println(x);
            }
        };

        System.setOut(ps);
    }*/
}
