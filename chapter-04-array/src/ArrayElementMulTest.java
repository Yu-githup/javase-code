/**
 * 数组元素总乘积
 *
 * @author Yu
 * @create 2026-03-10 22:36
 */
public class ArrayElementMulTest {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 1, 9};

        // 求总乘积
        int result = 1; // 因为乘以任何数都不影响结果
        for (int i = 0; i < arr.length; i++) {
            result *= arr[i];
        }

        System.out.println("result = " + result);
    }
}
