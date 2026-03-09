import java.util.Scanner;

/**
 * 死循环案例2
 *
 * @author Yu
 * @create 2026-03-09 22:07
 */
public class InfiniteLoopDemo02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int positiveNumber = 0;// 统计正数的个数
        int negativeNumber = 0;// 统计负数的个数
        for(;;){  // while(true){
            System.out.println("请输入一个整数：(输入为0时结束程序)");
            int num = scanner.nextInt();
            if(num > 0){
                positiveNumber++;
            }else if(num < 0){
                negativeNumber++;
            }else{
                System.out.println("程序结束");
                break;
            }
        }
        System.out.println("正数的个数为："+ positiveNumber);
        System.out.println("负数的个数为："+ negativeNumber);
        scanner.close();
    }
}
