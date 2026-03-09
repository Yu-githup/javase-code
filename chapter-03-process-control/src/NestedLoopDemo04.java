/**
 * 嵌套循环案例4：打印菱形
 *
 * @author Yu
 * @create 2026-03-09 22:11
 */
public class NestedLoopDemo04 {
    public static void main(String[] args) {
    /*
        上半部分		i		m(表示-的个数)    n(表示*的个数)关系式：2*i + m = 10 --> m = 10 - 2*i
    --------*		   1	   8			   1							n = 2 * i - 1
    ------* * *		   2	   6			   3
    ----* * * * *	   3	   4			   5
    --* * * * * * *	   4	   2		       7
    * * * * * * * * *  5	   0			   9

        下半部分         i      m                n              关系式： m = 2 * i
    --* * * * * * *    1       2                7                     n = 9 - 2 * i
    ----* * * * *      2       4                5
    ------* * *        3       6                3
    --------*          4       8                1

            */
        //上半部分
        for (int i = 1; i <= 5; i++) {
            //-
            for (int j = 1; j <= 10 - 2 * i; j++) {
                System.out.print(" ");
            }
            //*
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        //下半部分
        for (int i = 1; i <= 4; i++) {
            //-
            for (int j = 1; j <= 2 * i; j++) {
                System.out.print(" ");
            }

            //*
            for (int k = 1; k <= 9 - 2 * i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
