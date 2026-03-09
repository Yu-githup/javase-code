import java.util.Scanner;

/**
 * 章节案例4：判断年月日是否合法
 * 从键盘输入年、月、日，要求年份必须是正整数，月份范围是[1,12]，日期也必须在本月总天数范围内，如果输入正确，输出“年-月-日”结果，否则提示输入错误。
 * 注意：需要考虑闰年的情况。
 *
 * @author Yu
 * @create 2026-03-09 22:32
 */
public class Demo04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入日期：");
        System.out.print("年：");
        int year = input.nextInt();

        System.out.print("月：");
        int month = input.nextInt();

        System.out.print("日：");
        int day = input.nextInt();
        input.close();

        if (year > 0) {
            if (month >= 1 && month <= 12) {
                // 计算month月的总天数
                int days;
                if (month == 2) {
                    if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) { //此条件下，为闰年
                        days = 29;
                    } else {
                        days = 28;
                    }
                }else if (month == 4 || month == 6 || month == 9 || month == 11) {
                    days = 30;
                }else {
                    days = 31;
                }

                if(day >= 1 && day <= days) {
                    System.out.println(year + "-" + month + "-" + day);
                }else{
                    System.out.println("日期输入不合法");
                }
            }else {
                System.out.println("月份输入不合法");
            }
        }else {
            System.out.println("年份输入不合法");
        }
    }
}
