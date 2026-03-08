/**
 * 自增练习
 *
 * @author Yu
 * @create 2026-03-08 22:36
 */
public class AutoIncrementPractice {
    public static void main(String[] args) {
        int i = 1;
        int j = i++ + ++i * i++; // 不建议这样写.这里仅仅测试
        System.out.println("j = " + j); // j = 10
    }
}
