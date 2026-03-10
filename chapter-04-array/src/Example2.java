/**
 * 二维数组初始化示例
 *
 * @author Yu
 * @create 2026-03-10 22:04
 */
public class Example2 {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9,10}};// 声明与初始化必须在一句完成

        int[][] arr1 = new int[][]{{1,2,3},{4,5,6},{7,8,9,10}};

        int[][] arr2;
        arr2 = new int[][]{{1,2,3},{4,5,6},{7,8,9,10}};

        // arr2 = new int[3][3]{{1,2,3},{4,5,6},{7,8,9,10}};// 错误，静态初始化右边new 数据类型[][]中不能写数字
    }
}
