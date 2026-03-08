/**
 * 自动类型提升练习
 *
 * @author Yu
 * @create 2026-03-08 21:58
 */
public class CalculateValueTypePractice {
    public static void main(String[] args) {
        float x = 1;
        double y =1;
        int a = 1;
        long b = 1;
        char c = 1;

        // long value = x + y * a / x + b / y + c; 编译不通过
        double value = x + y * a / x + b / y + c;
    }
}
