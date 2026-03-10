/**
 * 找最值及所有最值的下标
 *
 * @author Yu
 * @create 2026-03-10 22:39
 */
public class ArrayElementAllMaxIndex {
    public static void main(String[] args) {
        int[] arr = {4,5,6,1,9,9,3};

        // 找最大值
        int max = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        System.out.println("最大值是：" + max);
        System.out.print("最大值的下标有：");

        // 遍历数组，查看那些元素和最大值一样的
        for (int i = 0; i < arr.length; i++) {
            if (max == arr[i]) {
                System.out.print(i + "\t");
            }
        }
        System.out.println();
    }
}
