import java.util.Scanner;

/**
 * do-while循环案例3:ATM
 * 声明变量balance并初始化为0，用以表示银行账户的余额，下面通过ATM机程序实现存款，取款等功能。
 *
 * =========ATM========
 *    1、存款
 *    2、取款
 *    3、显示余额
 *    4、退出
 * 请选择(1-4)：
 *
 * @author Yu
 * @create 2026-03-09 22:02
 */
public class DoWhileLoopDemo03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 0;
        boolean isFlag = true;

        do{
            System.out.println("=========ATM========");
            System.out.println("\t1、存款");
            System.out.println("\t2、取款");
            System.out.println("\t3、显示余额");
            System.out.println("\t4、退出");
            System.out.print("请选择(1-4)：");
            int options = scanner.nextInt();
            switch (options){
                case 1:
                    System.out.println("请输入你的存款金额：");
                    double addMoney = scanner.nextDouble();
                    if (addMoney > 0) {
                        balance += addMoney;
                    }
                    break;
                case 2:
                    System.out.println("请输入你的取款金额：");
                    double minusMoney = scanner.nextDouble();
                    if (minusMoney > 0 && balance > minusMoney){
                        balance -= minusMoney;
                    }else {
                        System.out.println("取款金额有误或余额不足！！！");
                    }
                    break;
                case 3:
                    System.out.println("账户可以金额为：" + balance);
                    break;
                case 4:
                    System.out.println("欢迎下次光临");
                    isFlag = false;
                    break;
                default:
                    System.out.println("超过选项范围,请重新选择");
                    break;
            }
        }while (isFlag);
        scanner.close();
    }
}
