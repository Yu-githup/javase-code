package object_character.encapsulation;

/**
 * 成员方法私有化
 *
 * @author Yu
 * @create 2026-03-13 21:40
 */

public class ArrayUtil {
    public int max(int[] arr) {
        int maxValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (maxValue < arr[i]) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }

    public int min(int[] arr) {
        int minValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (minValue > arr[i]) {
                minValue = arr[i];
            }
        }
        return minValue;
    }

    public int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }


    public int avg(int[] arr) {
        int sumValue = sum(arr);
        return sumValue / arr.length;
    }
    // 创建一系列重载的上述方法
    // public double max(double[] arr){}
    // public float max(float[] arr){}
    // public byte max(byte[] arr){}

    public void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public int[] copy(int[] arr) {
        int[] arr1 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[i];
        }
        return arr1;
    }

    public void reverse(int[] arr) {
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public void sort(int[] arr, String desc) {
        if ("ascend".equals(desc)) {//if(desc.equals("ascend")){
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = 0; j < arr.length - 1 - i; j++) {
                    if (arr[j] > arr[j + 1]) {
                        // int temp = arr[j];
                        // arr[j] = arr[j + 1];
                        // arr[j + 1] = temp;
                        swap(arr, j, j + 1);
                    }
                }
            }
        } else if ("descend".equals(desc)) {
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = 0; j < arr.length - 1 - i; j++) {
                    if (arr[j] < arr[j + 1]) {
                        // int temp = arr[j];
                        // arr[j] = arr[j + 1];
                        // arr[j + 1] = temp;
                        swap(arr, j, j + 1);
                    }
                }
            }
        } else {
            System.out.println("您输入的排序方式有误！");
        }
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public int getValue(int[] arr, int value) {
        //方法：线性查找
        for (int i = 0; i < arr.length; i++) {
            if (value == arr[i]) {
                return i;
            }
        }
        return -1;
    }
}
