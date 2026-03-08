/**
 * 练习
 *
 * @author Yu
 * @create 2026-03-08 22:59
 */
public class ConditionExer3 {
    public static void main(String[] args) {
        int week = 2;
        week += 10;
        week %= 7;
        System.out.println("今天是周2,10天以后是周" + (week == 0 ? "日" : week));
    }

}
