/**
 * 逻辑运算符
 *
 * @author Yu
 * @create 2026-03-08 22:51
 */
public class LogicTest {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = 5;

        // & 与，且；有false则false
        System.out.println((a > b) & (a > c)); // false & false ===> false
        System.out.println((a > b) & (a < c)); // false & true  ===> false
        System.out.println((a < b) & (a > c)); // true & false  ===> false
        System.out.println((a < b) & (a < c)); // true & true   ===> true
        System.out.println("===============");
        // | 或；有true则true
        System.out.println((a > b) | (a > c)); // false | false  ===> false
        System.out.println((a > b) | (a < c)); // false | true   ===> true
        System.out.println((a < b) | (a > c)); // true | false   ===> true
        System.out.println((a < b) | (a < c)); // true | true    ===> true
        System.out.println("===============");
        // ^ 异或；相同为false，不同为true
        System.out.println((a > b) ^ (a > c)); // false ^ false  ===> false
        System.out.println((a > b) ^ (a < c)); // false ^ true   ===> true
        System.out.println((a < b) ^ (a > c)); // true ^ false   ===> true
        System.out.println((a < b) ^ (a < c)); // true ^ true    ===> false
        System.out.println("===============");
        // ! 非；非false则true，非true则false
        System.out.println(!false);  // true
        System.out.println(!true);   // false

        // &和&&的区别
        System.out.println((a > b) & (a++ > c)); // false  & false ===> false
        System.out.println("a = " + a); // 4
        System.out.println((a > b) && (a++ > c)); // false(后面不执行) ===> false
        System.out.println("a = " + a); // 4
        System.out.println((a == b) && (a++ > c)); // true && false ===> false
        System.out.println("a = " + a); // 5
        System.out.println("===============");

        // |和||的区别
        System.out.println((a > b) | (a++ > c)); // true | false ===> false
        System.out.println("a = " + a); // 6
        System.out.println((a > b) || (a++ > c)); // true(后面不执行) ===> true
        System.out.println("a = " + a); // 6
        System.out.println((a == b) || (a++ > c)); // false || true ===> true
        System.out.println("a = " + a); // 7
    }
}
