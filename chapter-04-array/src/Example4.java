/**
 * 二维数组动态初始化示例
 *
 * @author Yu
 * @create 2026-03-10 22:07
 */
public class Example4 {
    public static void main(String[] args) {
        // 定义了名称为arr的二维数组
        int[][] arr;

        // 二维数组中有3个一维数组,每一个一维数组中有2个元素
        arr = new int[3][2];

        // 一维数组的名称分别为arr[0], arr[1], arr[2]
        // 给第一个一维数组1脚标位赋值为78写法是：`arr[0][1] = 78;`
        arr[0][1] = 78;
    }
}
