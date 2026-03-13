package class_member.constructor;

/**
 * 测试类
 *
 * @author Yu
 * @create 2026-03-13 22:02
 */
public class StudentTest {
    public static void main(String[] args) {
        //调用无参构造创建学生对象
        Student s1 = new Student();
        System.out.println(s1.getInfo());

        //调用有参构造创建学生对象
        Student s2 = new Student("张三",23);
        System.out.println(s2.getInfo());
    }
}
