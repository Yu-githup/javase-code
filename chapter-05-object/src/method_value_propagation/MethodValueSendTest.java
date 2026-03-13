package method_value_propagation;

/**
 * 方法值传递测试
 * 交换两个整型变量的值
 *
 * @author Yu
 * @create 2026-03-13 20:55
 */
public class MethodValueSendTest {
    public static void main(String[] args) {
        int m = 10;
        int n = 20;
        System.out.println("m = " + m + ", n = " + n);

        //交换m和n的值
        // int temp = m;
        // m = n;
        // n = temp;

        MethodValueSendTest test = new MethodValueSendTest();
        test.swap(m, n);
        System.out.println("m = " + m + ", n = " + n);
    }

    public void swap(int m, int n) {
        int temp = m;
        m = n;
        n = temp;
    }
}
