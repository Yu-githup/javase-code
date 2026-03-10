/**
 * 数组元素中偶数个数
 *
 * @author Yu
 * @create 2026-03-10 22:37
 */
public class ArrayElementEvenCount {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 1, 9};

        // 统计偶数个数
        int evenCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenCount++;
            }
        }

        System.out.println("evenCount = " + evenCount);
    }
}
