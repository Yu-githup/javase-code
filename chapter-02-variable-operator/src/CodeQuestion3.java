/**
 * 代码题3
 *
 * @author Yu
 * @create 2026-03-08 22:43
 */
public class CodeQuestion3 {
    public static void main(String[] args) {
        int i = 2;
        i *= i++; // i = 2 * 2

        int j = 2;
        j *= j+1; // j = 2 * 3

        int k = 2;
        k *= ++k; // k = 2 * ++k ===》 k = 2 * 3

        System.out.println(i); // 4
        System.out.println(j); // 6
        System.out.println(k); // 6
    }
}
