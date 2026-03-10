/**
 * 数组反转(方式2)
 *
 * @author Yu
 * @create 2026-03-10 23:06
 */
public class TestArrayReverse2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("反转之前：");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //反转
        //左右对称位置交换
        for (int left = 0, right = arr.length - 1; left < right; left++, right--) {
            //首  与  尾交换
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }

        System.out.println("反转之后：");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
