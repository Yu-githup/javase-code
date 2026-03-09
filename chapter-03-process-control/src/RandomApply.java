/**
 * 随机数的使用
 *
 * @author Yu
 * @create 2026-03-09 22:28
 */
public class RandomApply {
    public static void main(String[] args) {
        double value = Math.random();
        System.out.println(value);

        // [1,6]
        int number = (int)(Math.random() * 6) + 1;
        System.out.println(number);
    }
}
