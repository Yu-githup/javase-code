/**
 * 快速排序
 *
 * @author Yu
 * @create 2026-03-11 20:37
 */
public class QuickSort {
    // 对外暴露的排序方法（简化调用）
    public static void quickSort(int[] arr) {
        // 空数组或单元素数组无需排序
        if (arr == null || arr.length <= 1) {
            return;
        }
        // 调用核心递归方法，处理整个数组（左边界0，右边界arr.length-1）
        quickSort(arr, 0, arr.length - 1);
    }

    // 核心递归排序方法
    private static void quickSort(int[] arr, int left, int right) {
        // 递归终止条件：左边界 >= 右边界（子数组只有1个/0个元素）
        if (left >= right) {
            return;
        }

        // 分区操作：返回基准值最终的位置，同时完成“左小右大”的分区
        int pivotIndex = partition(arr, left, right);

        // 递归处理左半部分（基准值左侧）
        quickSort(arr, left, pivotIndex - 1);
        // 递归处理右半部分（基准值右侧）
        quickSort(arr, pivotIndex + 1, right);
    }

    // 分区方法：选择基准值，调整数组，返回基准值的最终索引
    private static int partition(int[] arr, int left, int right) {
        // 优化：选择右边界作为基准值（新手易理解，也可选择中间值/随机值避免最坏情况）
        int pivot = arr[right];
        // i 是“小于基准值区域”的右边界（初始为左边界-1）
        int i = left - 1;

        // 遍历左边界到右边界-1的所有元素
        for (int j = left; j < right; j++) {
            // 如果当前元素 <= 基准值，将其划入“小于基准值区域”
            if (arr[j] <= pivot) {
                i++; // 扩大“小于基准值区域”
                swap(arr, i, j); // 交换当前元素到区域末尾
            }
        }

        // 将基准值放到“小于区域”和“大于区域”的中间（即i+1位置）
        swap(arr, i + 1, right);
        // 返回基准值的最终索引
        return i + 1;
    }

    // 辅助方法：交换数组中两个位置的元素
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // 测试用例
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 3, 8, 4, 1, 7, 6};
        System.out.println("排序前：");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        quickSort(arr);

        System.out.println("\n排序后：");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
