package variable_args;

/**
 * 测试
 *
 * @author Yu
 * @create 2026-03-13 20:48
 */
public class StringToolsTest {
    public static void main(String[] args) {
        StringTools tools = new StringTools();
        System.out.println(tools.concat('-'));
        System.out.println(tools.concat('-',"hello"));
        System.out.println(tools.concat('-',"hello","world"));
        System.out.println(tools.concat('-',"hello","world","java"));
    }
}
