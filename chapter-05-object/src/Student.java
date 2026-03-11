/**
 * 类的成员变量
 *
 * @author Yu
 * @create 2026-03-11 22:20
 */
public class Student {
    String name; // 成员变量(实例变量)
    int age; // 成员变量
    static char gender; // 类变量

    {
        int a = 1; // 局部变量
    }

    public void sayHello(String  name){ // name局部变量
        String info = "hello!"; // 局部变量
        System.out.println(info + name);
    }
}
