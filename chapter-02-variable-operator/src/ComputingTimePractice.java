/**
 * 计算时间
 *
 * @author Yu
 * @create 2026-03-08 22:34
 */
public class ComputingTimePractice {
    public static void main(String[] args) {
        int hours = 89;
        int day = hours / 24;
        int hour = hours % 24;

        System.out.println("为抵抗洪水，战士连续作战 89 小时：");
        System.out.println(hours + "小时是" + day + "天" + hour +"小时");
    }
}
