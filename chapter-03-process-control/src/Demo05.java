import java.util.Scanner;

/**
 * 章节案例：素数判断
 * 从键盘输入一个大于1的自然数，判断它是否是素数。
 * 提示：素数是指大于1的自然数中，除了1和它本身以外不能再有其他因数的自然数，即某个素数n，在[2,n-1]范围内没有其他自然数可以把n整除
 *
 * @author Yu
 * @create 2026-03-09 22:33
 */
public class Demo05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int num = input.nextInt();

        // 假设num是素数
        boolean isFlag = true;

        // 开始寻址那些不是素数的值
        for (int i = 2; i < num; i++) { // i<=Math.sqrt(num);这个方式有问题，比如输入9的时候，会判断为素数
            // num被某个i整除了，num就不是素数
            if (num % i == 0) {
                isFlag = false;
                break; // 找到其中一个可以把num整除的数，就可以结束了，因为num已经可以判定不是素数了
            }
        }

        // 只有把[2,num-1]之间的所有数都检查过了，才能下定结论，num是素数
        if(num >1 && isFlag){
            System.out.println(num + "是素数");
        }else{
            System.out.println(num + "不是素数");
        }

        input.close();
    }
}
