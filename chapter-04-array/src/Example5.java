/**
 * 二维数组练习
 *
 * @author Yu
 * @create 2026-03-10 22:08
 */
public class Example5 {
    public static void main(String[] args) {
        // 1、声明一个二维数组，并且确定行数
        // 因为每一行的列数不同，这里无法直接确定列数
        int[][]  arr = new int[5][];

        // 2、确定每一行的列数
        for(int i=0; i<arr.length; i++){
			/*
			arr[0] 的列数是1
			arr[1] 的列数是2
			arr[2] 的列数是3
			arr[3] 的列数是4
			arr[4] 的列数是5
			*/
            arr[i] = new int[i+1];
        }

        // 3、确定元素的值并遍历
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                arr[i][j] = i+1;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
