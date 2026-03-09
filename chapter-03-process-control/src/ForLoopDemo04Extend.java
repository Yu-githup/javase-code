/**
 * for循环案例4扩展
 * 打印出四位数字中“个位+百位”等于“十位+千位”并且个位数为偶数，千位数为奇数的数字，并打印符合条件的数字的个数。
 *
 * @author Yu
 * @create 2026-03-09 21:08
 */
public class ForLoopDemo04Extend {
    public static void main(String[] args) {
        // 定义统计变量，初始化值是0
        int count = 0;

        for (int i = 1000; i < 10000; i++) {
            // 获取三位数的个位，十位，百位,千位
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 10;
            int qian = i / 1000;

            // 判断是否满足条件
            if ((ge + bai == shi + qian) && (ge % 2 == 0) && (qian % 2 != 0)) {
                System.out.println("满足的数值为：" + i);
                count++;
            }
        }
        // 输出统计结果就可以了
        System.out.println("符合条件的共有"+count+"个");
    }
}
