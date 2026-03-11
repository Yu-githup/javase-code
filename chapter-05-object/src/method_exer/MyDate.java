package method_exer;

/**
 * 日期类
 *
 * @author Yu
 * @create 2026-03-11 23:11
 */
public class MyDate {
    int year;
    int month;
    int day;

    public String  showDate(){
        return year + "-" + month + "-" + day;
    }

    public static void main(String[] args) {
        MyDate md1 = new MyDate();
        md1.year = 2026;
        md1.month = 03;
        md1.day = 21;
        System.out.println("你的出生日期为：" + md1.showDate());

        MyDate md2 = new MyDate();
        md2.year = 2029;
        md2.month = 01;
        md2.day = 22;
        System.out.println("你对象的出生日期为：" + md2.showDate());
    }
}
