/**
 * if分支结构案例
 * 成年人心率的正常范围是每分钟60-100次。
 * 体检时，如果心率不在此范围内，则提示需要做进一步的检查。
 *
 * @author Yu
 * @create 2026-03-09 20:16
 */
public class IFElseDemo01 {
    public static void main(String[] args) {
        int heartBeats = 89;

        // 方式1
        if (heartBeats < 60 || heartBeats > 100) {
            System.out.println("你需要做进一步的检查");
        }

        // 方式2
        if (!(heartBeats > 60 && heartBeats < 100)){
            System.out.println("你需要做进一步的检查");
        }

        System.out.println("体检结束");

    }
}
