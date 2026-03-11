/**
 * 数组中的空指针异常测试
 *
 * @author Yu
 * @create 2026-03-11 20:46
 */
public class NullPointerExceptionTest {
    public static void main(String[] args) {
        //定义数组
        int[][] arr = new int[3][];
        System.out.println(arr[0][0]);//NullPointerException
    }
}
