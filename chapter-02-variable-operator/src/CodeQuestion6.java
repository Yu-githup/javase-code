/**
 * 代码题6
 *
 * @author Yu
 * @create 2026-03-08 22:47
 */
public class CodeQuestion6 {
    public static void main(String[] args) {
        int a1 = 10, a2 = 11;
        // System.out.println(a1+ "是偶数？" + true); 不建议

        System.out.println(a1+ "是偶数？" + (a1 % 2 == 0));
        System.out.println(a2+ "是偶数？" + (a2 % 2 == 0));

        int a3 = 12, a4 = 13;
        System.out.println(a3+ "是奇数？" + (a3 % 2 != 0));
        System.out.println(a4+ "是奇数？" + (a4 % 2 != 0));
    }
}
