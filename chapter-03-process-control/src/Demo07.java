import java.util.Scanner;

/**
 * 章节案例7：解方程
 * 求x<sup>2</sup>-4x+1=0方程的根
 *
 * 求x<sup>2</sup>-2x+1=0方程的根
 *
 * @author Yu
 * @create 2026-03-09 22:36
 */
public class Demo07 {
    public static void main(String[] args) {
        // 1、先输入a,b,c三个函数的参数
        Scanner input = new Scanner(System.in);
        System.out.println("请输入方程：ax的平方 + bx + c = 0的三个参数：");
        System.out.print("a：");
        double a = input.nextDouble();

        System.out.print("b：");
        double b = input.nextDouble();

        System.out.print("c：");
        double c = input.nextDouble();
        input.close();

        // 2、根据参数的不同，求方程的根/解
        if(a!=0){
            double d = b*b - 4*a*c;
            if(d>0){
                double x1 = (-b + Math.sqrt(d))/(2*a);
                double x2 = (-b - Math.sqrt(d))/(2*a);
                System.out.println("一元二次方程有两个根：" + x1 + "," +x2);
            }else if(d==0){
                double x = -b/(2*a);
                System.out.println("一元二次方程有1个根："+ x);
            }else{//d<0
                System.out.println("一元二次方程在实数范围内无解");
            }
        }else{//a==0
            if(b!=0){
                double x = -c/b;
                System.out.println("一元一次方程的根：" + x);
            }else{
                System.out.println("输入有误，a,b,c的值不能构成一个方程");
            }
        }
    }
}
