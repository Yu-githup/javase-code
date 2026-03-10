/**
 * 数值型数组特征值统计
 *
 * @author Yu
 * @create 2026-03-10 22:35
 */
public class ArrayElementSumTest {
    public static void main(String[] args) {
        int[] arr = {4,5,6,1,9};
        // 求总和
        int sum = 0;// 因为0加上任何数都不影响结果
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        // 求均值(记住，均值不需要在重复求和遍历)
        double avg = (double)sum/arr.length;

        System.out.println("sum = " + sum);
        System.out.println("avg = " + avg);
    }
}
