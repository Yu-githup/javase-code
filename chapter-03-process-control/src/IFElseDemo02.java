/**
 * if案例2
 *
 * @author Yu
 * @create 2026-03-09 20:17
 */
public class IFElseDemo02 {
    public static void main(String[] args) {
        int num = -91;
        String str;

        if (num % 2 == 0) {
            str = "偶数";
        }else {
            str = "计数";
        }
        System.out.println("这个数" + num + "是" + str);
    }
}
