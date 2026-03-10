/**
 *  案例3：使用二维数组打印一个 10 行杨辉三角。
 *   <p>
 *     1. 第一行有 1 个元素, 第 n 行有 n 个元素
 *     2. 每一行的第一个元素和最后一个元素都是 1
 *     3. 从第三行开始, 对于非第一个元素和最后一个元素的元素。即：
 *     yanghui[i][j] = yanghui[i-1][j-1] + yanghui[i-1][j];
 *  </p>
 *
 * @author Yu
 * @create 2026-03-10 22:20
 */
public class TwoArrayCase3 {
    public static void main(String[] args) {
        // 1. 动态初始化的方式创建二维数组
        int[][] yanghui = new int[10][];
        // 2. 遍历外层
        for (int i = 0; i < yanghui.length; i++) {
            // 3. 第一行有 1 个元素, 第 n 行有 n 个元素
            yanghui[i] = new int[i + 1];
            // 4. 每一行的第一个元素和最后一个元素都是 1
            yanghui[i][0] = yanghui[i][i] = 1;
            // 5. 从第三行开始, 对于非第一个元素和最后一个元素的元素。
            for (int j = 1; j < yanghui[i].length-1; j++) { //非首元素和非末元素的角标排除0，和数组.length
                yanghui[i][j] = yanghui[i-1][j-1] + yanghui[i-1][j];
            }
        }

        // 5. 遍历二维数组
        for (int i = 0; i < yanghui.length; i++) {
            for (int j = 0; j < yanghui[i].length; j++) {
                System.out.print(yanghui[i][j] + " ");
            }
            System.out.println();
        }
    }
}
