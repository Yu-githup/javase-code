/**
 * 前++和后++合并使用
 *
 * @author Yu
 * @create 2026-03-08 22:31
 */
public class BeforeAdditionAddition {
    public static void main(String[] args) {
        // 其他变量放在一起使用
        int x = 3;
        //int y = ++x; // y 的值是 4，x 的值是 4，
        int y = x++; // y 的值是 3，x 的值是 4
        System.out.println(x);
        System.out.println(y);
        System.out.println("==========");

        // 和输出语句一起
        int z = 5;
        //System.out.println(++z);// 输出结果是 6，z 的值也是 6
        System.out.println(z++);// 输出结果是 5，z 的值是 6
        System.out.println(z);
    }
}
