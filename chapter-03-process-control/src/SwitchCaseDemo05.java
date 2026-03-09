import java.util.Scanner;

/**
 * switch案例5
 * 需求：指定一个月份，输出该月份对应的季节。一年有四季:
 * 3,4,5	春季
 * 6,7,8	夏季
 * 9,10,11	秋季
 * 12,1,2	冬季
 *
 * @author Yu
 * @create 2026-03-09 20:47
 */
public class SwitchCaseDemo05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        String season;
        switch (month) {
            case 1:
            case 2:
            case 12:
                season = "冬季";
                break;
            case 3:
            case 4:
            case 5:
                season = "春季";
                break;
            case 6:
            case 7:
            case 8:
                season = "夏季";
                break;
            case 9:
            case 10:
            case 11:
                season = "秋季";
                break;
            default:
                season = "出错了";
                break;
        }
        System.out.println(season);
        scanner.close();
    }
}
