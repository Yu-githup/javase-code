/**
 * break和continue关键字案例1
 * 找出100以内所有的素数（质数）？100000以内的呢？
 *
 * @author Yu
 * @create 2026-03-09 22:20
 */
public class BreakContinueDemo01 {
    public static void main(String[] args) {
        //boolean isFlag = true; //用于标识i是否被除尽过

        // //记录当前时间距离1970-1-1 00:00:00的毫秒数
        long start = System.currentTimeMillis();

        // 记录质数个数
        int count = 0;

        for (int i = 2; i <= 100000; i++) { // i
            // 用于标识i是否被除尽过
            boolean isFlag = true;
            for (int j = 2; j < i - 1; j++) {
                // 表明i有约数
                if (i % j == 0){
                    isFlag = false;
                }
            }

            // 判断i是否是质数
            if (isFlag) { // 如果isFlag变量没有给修改过值，就意味着i没有被j除尽过。则i是一个质数
                System.out.println(i);
                count++;
            }

            // 重置isFlag
            isFlag = true;
        }

        long end = System.currentTimeMillis();
        System.out.println("质数的个数为：" + count);
        System.out.println("执行此程序花费的毫秒数为：" + (end - start));
    }
}
