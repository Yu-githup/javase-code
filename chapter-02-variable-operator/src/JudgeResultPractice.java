/**
 * 字符串练习-判断对错
 *
 * @author Yu
 * @create 2026-03-08 22:14
 */
public class JudgeResultPractice {
    public static void main(String[] args) {
        // String str1 = 4;                       // 判断对错：×
        String str2 = 3.5f + "";               // 判断str2对错：√
        System.out.println(str2);              // 输出："3.5"
        System.out .println(3+4+"Hello!");     // 输出："7Hello!"
        System.out.println("Hello!"+3+4);      // 输出："Hello!34"
        System.out.println('a'+1+"Hello!");    // 输出："98Hello!"
        System.out.println("Hello"+'a'+1);     // 输出："Helloa1"
    }
}
