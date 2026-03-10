/**
 * 数组复制与赋值举例4
 *
 * @author Yu
 * @create 2026-03-10 23:01
 */
public class Test4 {
    public static void main(String[] args) {
        // 5-67 Math.random() * 63 + 5;

        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {// [0,1) [0,30) [1,31)
            arr[i] = (int) (Math.random() * 30) + 1;

            boolean flag = false;
            while (true) {
                for (int j = 0; j < i; j++) {
                    if (arr[i] == arr[j]) {
                        flag = true;
                        break;
                    }
                }
                if (flag) {
                    arr[i] = (int) (Math.random() * 30) + 1;
                    flag = false;
                    continue;
                }
                break;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //更优的方法

        int[] arr1 = new int[6];
        for (int i = 0; i < arr1.length; i++) {// [0,1) [0,30) [1,31)
            arr1[i] = (int) (Math.random() * 30) + 1;
            for (int j = 0; j < i; j++) {
                if (arr1[i] == arr1[j]) {
                    i--;
                    break;
                }
            }
        }

        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

    }
}
