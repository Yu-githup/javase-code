/**
 * 数组中的角标越界异常
 *
 * @author Yu
 * @create 2026-03-11 20:46
 */
public class TestArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        // System.out.println("最后一个元素：" + arr[3]);//错误，下标越界
        //  System.out.println("最后一个元素：" + arr[arr.length]);//错误，下标越界
        System.out.println("最后一个元素：" + arr[arr.length-1]);//对
    }
}
