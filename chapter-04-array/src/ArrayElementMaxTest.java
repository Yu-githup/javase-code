/**
 * 数组元素最大值
 *
 * @author Yu
 * @create 2026-03-10 22:38
 */
public class ArrayElementMaxTest {
    public static void main(String[] args) {
        int[] arr = {4,5,6,1,9};

        // 找最大值(默认第一个)
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println(max);
    }
}
