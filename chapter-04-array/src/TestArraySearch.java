/**
 * 数组元素查找（二分法）
 *
 * @author Yu
 * @create 2026-03-10 23:10
 */
public class TestArraySearch {
    public static void main(String[] args) {
        //二分法查找：要求此数组必须是有序的。
        int[] arr3 = new int[]{-99, -54, -2, 0, 2, 33, 43, 256, 999};
        boolean isFlag = true;
        int value = 256;
        //int value = 25;
        int head = 0;//首索引位置
        int end = arr3.length - 1;//尾索引位置
        // 确保有序
        while (head <= end) {
            // 获取数组中最中间的元素位置
            int middle = (head + end) / 2;
            // 判断我们找的元素恰好是中间位置元素
            if (arr3[middle] == value) {
                System.out.println("找到指定的元素，索引为：" + middle);
                isFlag = false;
                break;
                // 不是中间元素继续往→找
            } else if (arr3[middle] > value) {
                end = middle - 1;
                // 不是中间位置元素继续往←边找
            } else {//arr3[middle] < value
                head = middle + 1;
            }
        }

        if (isFlag) {
            System.out.println("未找打指定的元素");
        }
    }
}
