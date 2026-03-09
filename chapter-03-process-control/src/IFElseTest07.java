/**
 * if练习7
 * 如果大于95℃，则打印“开水”；
 * 如果大于70℃且小于等于95℃，则打印“热水”；
 * 如果大于40℃且小于等于70℃，则打印“温水”；
 * 如果小于等于40℃，则打印“凉水”。
 *
 * @author Yu
 * @create 2026-03-09 20:30
 */
public class IFElseTest07 {
    public static void main(String[] args) {
        int waterTemperature = 9;
        String str;

        // 同样没有精确范围就不能交换顺序
        if (waterTemperature > 95){
            str = "开水";
        } else if (waterTemperature > 70 && waterTemperature <= 95) {
            str = "热水";
        } else if (waterTemperature > 40 && waterTemperature <= 70) {
            str = "温水";
        } else { // 40度及以下的情况
            str = "凉水";
        }

        System.out.println(waterTemperature + "摄氏度水属于" + str);
    }
}
