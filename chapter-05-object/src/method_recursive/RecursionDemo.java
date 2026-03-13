package method_recursive;

/**
 * 计算1-n的和
 *
 * @author Yu
 * @create 2026-03-13 21:22
 */
public class RecursionDemo {
    public static void main(String[] args) {
        RecursionDemo demo = new RecursionDemo();
        //计算1~num的和，使用递归完成
        int num = 5;
        // 调用求和的方法
        int sum = demo.getSum(num);
        // 输出结果
        System.out.println(sum);
    }

    public int getSum(int num) {
        if (num == 1) {
            return 1;
        }
        return num + getSum(num - 1);
    }

    public int multiply(int num){
        if(num == 1){
            return 1;
        }else{
            return num * multiply(num - 1);
        }
    }

    public int f(int num){
        if(num == 0){
            return 1;
        }else if(num == 1){
            return 4;
        }else{
            return 2 * f(num - 1) + f(num - 2);
        }
    }

    public int func(int num){
        if(num == 20){
            return 1;
        }else if(num == 21){
            return 4;
        }else{
            return func(num + 2) - 2 * func(num + 1);
        }
    }

}
