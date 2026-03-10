/**
 * 找最值及第一次出现的下标
 *
 * @author Yu
 * @create 2026-03-10 22:38
 */
public class ArrayElementMaxIndex {
    public static void main(String[] args) {
        int[] arr = {4,5,6,1,9};

        // 找最大值以及第一个最大值下标
        int max = arr[0];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
                index = i;
            }
        }

        System.out.println("max = " + max);
        System.out.println("index = " + index);
    }
}
