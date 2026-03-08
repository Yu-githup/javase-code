/**
 * 代码题2
 *
 * @author Yu
 * @create 2026-03-08 22:42
 */
public class CodeQuestion2 {
    public static void main(String[] args) {
        int i = 1;
        i *= 0.2; // 自动类型提升：int i = 1.0 * 0.2 ===> 0.2 然后将0.2double转换为int类型
        System.out.println(i); // 0
        i++; // 0++ ===> 1
        System.out.println("i=" + i);//  i=1
    }
}
