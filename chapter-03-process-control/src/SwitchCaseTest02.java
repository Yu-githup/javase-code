/**
 * switch练习2
 * 使用 switch 把小写类型的 char型转为大写。只转换 a, b, c, d, e. 其它的输出 “other”。
 *
 * @author Yu
 * @create 2026-03-09 20:52
 */
public class SwitchCaseTest02 {
    public static void main(String[] args) {
        char word = 'a';
        switch (word){
            case 'a':
                word = 'A';
                break;
            case 'b':
                word = 'B';
                break;
            case 'c':
                word = 'C';
                break;
            case 'd':
                word = 'D';
                break;
            case 'e':
                word = 'E';
                break;
            default:
                System.out.println("other"); // 类型不兼容直接输出后退出
                System.exit(0);
        }
        System.out.println(word);
    }
}
