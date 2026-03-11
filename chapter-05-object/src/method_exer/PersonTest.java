package method_exer;

/**
 * 方法的练习1：
 *
 * @author Yu
 * @create 2026-03-11 22:52
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.study();
        p1.showAge();
        p1.addAge(2);
        p1.showAge();

        Person p2 = new Person();
        p2.study();
        p2.showAge();
        p2.addAge(3);
        p2.showAge();
    }
}

class Person {
    String name;
    int age;
    int gender;

    public void study() {
        System.out.println("studying...");
    }


    public void showAge() {
        System.out.println("age:" + age);
    }

    public int addAge(int i) {
        return age += i;
    }
}
