/**
 * if练习2
 *
 * @author Yu
 * @create 2026-03-09 20:25
 */
public class IFElseTest02 {
    public static void main(String[] args) {
        boolean b = true;

        if (b == false)// 建议：if(!b)
            System.out.println("a");
        else if (b)
            System.out.println("b");
        else if (!b)
            System.out.println("c");
        else
            System.out.println("d");

        // 如果写成if(b=false)能编译通过吗？如果能，结果是？
        // 此时就编程赋值操作,会执行c
    }
}
