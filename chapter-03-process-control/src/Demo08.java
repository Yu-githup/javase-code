import java.util.Scanner;

/**
 * 章节案例8：三天打鱼两天筛网
 * 需求：假设从2000年1月1日开始三天打渔，两天晒网，
 * 从键盘输入今天的日期年、月、日，显示今天是打鱼还是晒网？
 *
 * @author Yu
 * @create 2026-03-09 22:37
 */
public class Demo08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入年份：");
        int year = input.nextInt();
        System.out.println("请输入月份：");
        int month = input.nextInt();
        System.out.println("请输入日期：");
        int day = input.nextInt();

        /*
         （1）先算出，这一天距离2000年1月1日是第几天
		    ①第month月的day天
		    ②第year年的[1,month-1]的满月
		    ③从[2000,year-1]的满年天数
		（2）用总天数%5，看余数，余数是1,2,3是打鱼，4和0是晒网
         */
        // 1、第month月的day天
        int days = day;

        // 2、累加[1, month-1]的满月天数
        for (int i = 1; i < month; i++) {//这个i代表月份
            if (i == 4 || i == 6 || i == 9 || i == 11) {
                days += 30;
            } else if (i == 2) {
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    days += 29;
                } else {
                    days += 28;
                }
            } else {
                days += 31;
            }
        }

        // 3、从[2000, year -1]的满年天数
        for (int i = 2000; i < year; i++) { // i 表示年份
            if (i % 4 == 0 && i % 100 == 0 || i % 400 == 0) {
                days += 366;
            } else {
                days += 365;
            }
        }

        // 4、判断
        switch (days % 5){
            case 1:
            case 2:
            case 3:
                System.out.println("打鱼");
                break;
            default:
                System.out.println("筛网");
                break;
        }

        input.close();
    }
}
