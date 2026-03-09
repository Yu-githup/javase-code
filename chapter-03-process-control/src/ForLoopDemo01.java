/**
 * for循环案例1
 * 使用for循环输出5行HelloWorld
 *
 * @author Yu
 * @create 2026-03-09 21:03
 */
public class ForLoopDemo01 {
    public static void main(String[] args) {
        // 方式1：不推荐，没有理解到程序的精髓
        /*
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
        System.out.println("HelloWorld"); */

        // 方式2：使用for循环
        for (int i = 0; i < 5; i++) {
            System.out.println("HelloWorld");
        }
    }
}
