/**
 * for循环案例3:累加思想
 * 遍历1-100以内的偶数，并获取偶数的个数，获取所有的偶数的和
 *
 * @author Yu
 * @create 2026-03-09 21:06
 */
public class ForLoopDemo03 {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0){
                count++;
                sum+=i;
            }
        }
        System.out.println("一百以内偶数个数为：" + count + ",总和为：" +sum);
    }
}
