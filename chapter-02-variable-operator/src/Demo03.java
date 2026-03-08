/**
 * 章节案例3
 *
 * @author Yu
 * @create 2026-03-08 23:02
 */
public class Demo03 {
    public static void main(String[] args) {
        int year = 2018;
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
        System.out.println(year + (isLeapYear ? "是闰年" : "不是闰年"));
    }
}
