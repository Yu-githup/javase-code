package class_member.constructor.exer;

/**
 * 构造器练习2
 *
 * @author Yu
 * @create 2026-03-13 22:11
 */
public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student("张三", 18);
        System.out.println("学生姓名：" + s1.getName());
        System.out.println("学生年龄：" + s1.getAge());

        Student s2 = new Student("李四", 20, "xxx中学");
        System.out.println("学生姓名：" + s2.getName());
        System.out.println("学生学校：" + s2.getSchool());

        Student s3 = new Student("李四", 20, "xxx中学","计算机");
        System.out.println("学生姓名：" + s3.getName());
        System.out.println("学生专业：" + s3.getMajor());
    }
}

class Student{
    private String name;
    private int age;
    private String school;
    private String major;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSchool() {
        return school;
    }

    public String getMajor() {
        return major;
    }

    public Student(String n, int a) {
        name = n;
        age = a;
    }

    public Student(String n, int a, String s) {
        name = n;
        age = a;
        school = s;
    }

    public Student(String n, int a, String s, String m) {
        name = n;
        age = a;
        school = s;
        major = m;
    }
}
