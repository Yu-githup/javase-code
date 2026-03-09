/**
 * if练习1
 *
 * @author Yu
 * @create 2026-03-09 20:23
 */
public class IFElseTest01 {
    public static void main(String[] args) {
        int x = 4;
        int y = 1;
        if (x > 2) {
            if (y > 2) // if-else的作用范围只有一行代码体,也就是下面的hello不在作用范围
                System.out.println(x + y);
            System.out.println("hello"); // 输出
        } else
            System.out.println("x is " + x);
    }
}
