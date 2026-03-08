/**
 * 浮点类型练习：小明要到美国旅游，可是那里的温度是以华氏度为单位记录的。
 * 它需要一个程序将华氏温度（80度）转换为摄氏度，并以华氏度和摄氏度为单位分别显示该温度。
 *
 * @author Yu
 * @create 2026-03-08 21:40
 */
public class FloatTypeTest1 {
    public static void main(String[] args) {
        // 1、定义华氏温度
        double hua = 80;

        // 2、根据公式计算摄氏度
        double she = (hua - 32) / 1.8;

        // 3、输出结果
        System.out.println("华氏温度为" + hua + "时,摄氏度为:" + she + "℃");
    }
}
