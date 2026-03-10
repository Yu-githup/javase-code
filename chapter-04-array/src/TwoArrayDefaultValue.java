/**
 * 多维数组默认值
 *
 * @author Yu
 * @create 2026-03-10 22:13
 */
public class TwoArrayDefaultValue {
    public static void main(String[] args) {
        int[][] arr7 = new int[3][4];
        System.out.println(arr7);  // 地址值
        System.out.println(arr7[0]); // 地址值
        System.out.println(arr7[0][0]); // 0
        String[][] arr8 = new String[4][2];
        //外层元素默认值：
        System.out.println(arr8[0]); //[Ljava.lang.String;@41629346
        //内层元素默认值：
        System.out.println(arr8[0][1]);//null

        int[][] arr9 = new int[3][];
        System.out.println(arr9); // 地址值
        System.out.println(arr9[0]); // null
        System.out.println(arr9[0][0]); // 不存在，调用会报错空指针异常（NullPointerException）
    }
}
