/**
 * 标识符的各种规则
 *
 * @author Yu
 * @create 2026-03-08 20:51
 */
public class Identifier {
    public static void main(String[] args) {
        // 合法的(推荐的)
        int miles;
        int Test;
        int $4;
        int apps;
        int radius;

        // 合法的(不推荐,因为不规范)
        int x;
        int y;
        int $ = 1;
        //int _ = 1; //jdk17不行

        // 非法的
        // int a++;
        // int --b;
        // int #44;

        // int 1abc = 0;
        // int 12_A = 0;
        // int 4#R;

        int abc123abc = 0;
        int abc213 = 0;

        // 合法的;
        int classint;
        int publicgoto;
        int Public;
        int Int;

        // 非法的
        // int class;
        // int public;
        // int int;
        // int goto;

        int a = 1;
        int A = 2;
        System.out.println(a);
        System.out.println(A);
        int aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa = 3;
        System.out.println(aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa);

        // String user name = "张三";
        String username = "李四";
    }
}
