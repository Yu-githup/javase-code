package object_character.encapsulation.exer;

/**
 * 封装性练习1
 *
 * @author Yu
 * @create 2026-03-13 21:44
 */
public class PersonTest {
    public static void main(String[] args) {
        Person b = new Person();
        System.out.println("年龄为:" + b.getAge());
        b.setAge(111);
        System.out.println("年龄为:" + b.getAge());
        b.setAge(131);
    }
}

class Person {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int inputAge) {
        if (inputAge >= 0 && inputAge <= 130) {
            age = inputAge;
        } else {
            System.out.println("年龄在0-130岁之间");
        }
    }
}
