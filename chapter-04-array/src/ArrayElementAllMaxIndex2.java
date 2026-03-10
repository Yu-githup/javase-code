/**
 * 找最值及所有最值的下标(优化)
 *
 * @author Yu
 * @create 2026-03-10 22:40
 */
public class ArrayElementAllMaxIndex2 {
    public static void main(String[] args) {
        int[] arr = {4,5,6,1,9,9,3};

        // 找最大值
        int max = arr[0];
        // 最大值所在下标
        String index = "0";

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i + "";
            } else if (arr[i] == max) {
                index += "," + i;
            }
        }

        System.out.println("最大值是：" + max);
        System.out.print("最大值的下标是[" + index + "]");
    }
}
