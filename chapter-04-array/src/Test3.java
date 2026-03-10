/**
 * 数组赋值与复制举例3
 *
 * @author Yu
 * @create 2026-03-10 23:01
 */
public class Test3 {
    public static void main(String[] args) {
        int[] arr = new int[]{12, 43, 65, 3, -8, 64, 2};

        //		for(int i = 0;i < arr.length;i++){
        //			arr[i] = arr[i] / arr[0];
        //		}
        for (int i = arr.length - 1; i >= 0; i--) {
            arr[i] = arr[i] / arr[0];
        }
        //遍历arr
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
