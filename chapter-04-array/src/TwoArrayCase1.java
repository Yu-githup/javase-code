/**
 * 二维数组案例1
 * 获取数组元素的总和
 *
 * @author Yu
 * @create 2026-03-10 22:19
 */
public class TwoArrayCase1 {
    public static void main(String[] args) {
        int[][] arr = {{3, 5, 8},{12, 9},{7, 0, 6, 4}};

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println("总和为：" + sum);
    }
}
