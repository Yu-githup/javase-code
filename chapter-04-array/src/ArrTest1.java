/**
 * 数组扩容与缩容
 * 现有数组 int[] arr = new int[]{1,2,3,4,5}; ，
 * 现将数组长度扩容1倍，并将10,20,30三个数据添加到arr数组中，如何操作？
 *
 * @author Yu
 * @create 2026-03-10 23:07
 */
public class ArrTest1 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        int[] newArr = new int[arr.length << 1];

        for(int i = 0;i < arr.length;i++){
            newArr[i] = arr[i];
        }

        newArr[arr.length] = 10;
        newArr[arr.length + 1] = 20;
        newArr[arr.length + 2] = 30;

        arr = newArr;

        //遍历arr
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
