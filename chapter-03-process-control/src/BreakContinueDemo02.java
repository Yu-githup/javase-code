/**
 * 优化
 *
 * @author Yu
 * @create 2026-03-09 22:21
 */
public class BreakContinueDemo02 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis(); // 记录当前时间距离1970-1-1 00:00:00的毫秒数

        int count = 0;// 记录质数的个数

        for(int i = 2;i <= 100000;i++){  // i

            boolean isFlag = true; // 用于标识i是否被除尽过

            for(int j = 2;j <= Math.sqrt(i);j++){ // 优化2：将循环条件中的i改为Math.sqrt(i)

                if(i % j == 0){ // 表明i有约数
                    isFlag = false;
                    break;// 优化1：主要针对非质数起作用
                }

            }

            // 判断i是否是质数
            if(isFlag){ // 如果isFlag变量没有给修改过值，就意味着i没有被j除尽过。则i是一个质数
                // System.out.println(i);
                count++;
            }

        }

        long end = System.currentTimeMillis();
        System.out.println("质数的个数为：" + count);
        System.out.println("执行此程序花费的毫秒数为：" + (end - start));
    }
}
