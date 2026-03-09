/**
 * for循环案例4:水仙花数
 * 结合分支结构使用**输出所有的水仙花数，所谓水仙花数是指一个3位数，其各个位上数字立方和等于其本身。
 * 例如： 153 = 1*1*1 + 3*3*3 + 5*5*5
 *
 * @author Yu
 * @create 2026-03-09 21:07
 */
public class ForLoopDemo04 {
    public static void main(String[] args) {
        // 定义统计变量，初始化值是0
        int count = 0;

        for (int i = 100; i < 1000; i++) {
            // 获取三位数的个位，十位，百位
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100;

            // 判断这个三位数是否是水仙花数，如果是，统计变量++
            if((ge*ge*ge+shi*shi*shi+bai*bai*bai) == i) {
                System.out.println("水仙花数：" + i);
                count++;
            }
        }

        // 输出统计结果就可以了
        System.out.println("水仙花数共有"+count+"个");
    }
}
