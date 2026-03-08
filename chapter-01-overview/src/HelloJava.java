/**
 * 测试单个源文件生成多个字节码的情况
 *
 * @author Yu
 * @create 2026-03-08 17:45
 */
public class HelloJava {
    public static void main(String[] args) {
        System.out.println("hello");
        // 会出现运行时异常,后续异常章节说明
        System.out.println(10 / 0);
    }
}


class HelloShangHai {
}

class HelloBeijing {
}
