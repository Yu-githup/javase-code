import java.util.Scanner;

/**
 * Scanner练习2
 * 我家的狗5岁了，5岁的狗相当于人类多大呢？其实，狗的前两年每一年相当于人类的10.5岁，之后每增加一年就增加四岁。那么5岁的狗相当于人类多少年龄呢？应该是：10.5 + 10.5 + 4 + 4 + 4 = 33岁。
 * 编写一个程序，获取用户输入的狗的年龄，通过程序显示其相当于人类的年龄。如果用户输入负数，请显示一个提示信息。
 *
 * @author Yu
 * @create 2026-03-09 22:27
 */
public class ScannerTest02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入狗的年龄：");
        int dogAge = scanner.nextInt();

        // 通过分支语句，判断狗狗相当于人的年龄
        if(dogAge < 0){
            System.out.println("你输入的狗狗的年龄不合法");
        } else if (dogAge == 0) {
            System.out.println("一岁不到");
        } else if(dogAge <= 2){
            System.out.println("相当于人的年龄：" + (dogAge * 10.5));
        }else{
            System.out.println("相当于人的年龄：" + (2 * 10.5 + (dogAge - 2) * 4));
        }

        scanner.close();
    }
}
