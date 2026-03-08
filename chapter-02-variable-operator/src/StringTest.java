/**
 * 字符串练习
 *
 * @author Yu
 * @create 2026-03-08 22:15
 */
public class StringTest {
    public static void main(String[] args) {
        System.out.println("*    *");				//输出："*     *"
        System.out.println("*\t*");					//输出："*	*"
        System.out.println("*" + "\t" + "*");		//输出："*	*"
        System.out.println('*' + "\t" + "*");		//输出："*	*"
        System.out.println('*' + '\t' + "*");		//输出："51*"
        System.out.println('*' + "\t" + '*');		//输出："*	*"
        System.out.println("*" + '\t' + '*');		//输出："*	*"
        System.out.println('*' + '\t' + '*');		//输出：93
    }
}
