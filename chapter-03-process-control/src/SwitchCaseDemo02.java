/**
 * switch案例2
 * 将英文季节转换成对应的中文
 *
 * @author Yu
 * @create 2026-03-09 20:41
 */
public class SwitchCaseDemo02 {
    public static void main(String[] args) {
        String season = "summer";
        String str;

        switch (season){
            case "spring":
                str = "春暖花开";
                break;
            case "summer":
                str = "夏日炎炎";
                break;
            case "autumn":
                str = "秋高气爽";
                break;
            case "winter":
                str = "白雪皑皑";
                break;
            default:
                str  = "季节有误";
                break;
        }

        System.out.println(str);
    }
}
