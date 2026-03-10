/**
 * 一维数组元素的调用示例
 *
 * @author Yu
 * @create 2026-03-10 19:09
 */
public class OneArrayExample3 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        System.out.println("arr数组的长度：" + arr.length);
        System.out.println("arr数组的第1个元素：" + arr[0]);// 下标从0开始
        System.out.println("arr数组的第2个元素：" + arr[1]);
        System.out.println("arr数组的第3个元素：" + arr[2]);
        System.out.println("arr数组的第4个元素：" + arr[3]);
        System.out.println("arr数组的第5个元素：" + arr[4]);
        // System.out.println("arr数组的第5个元素：" + arr[4]); // 报异常：ArrayIndexOutOfBoundsException

        // 修改第1个元素的值
        // 此处arr[0]相当于一个int类型的变量
        arr[0] = 100;
        System.out.println("arr数组的第1个元素：" + arr[0]);
    }
}
