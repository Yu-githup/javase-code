package object_character.encapsulation;

/**
 * 面向对象三大特性：封装性
 *
 * @author Yu
 * @create 2026-03-13 21:36
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person();

        //实例变量私有化，跨类是无法直接使用的
		/* p.name = "张三";
		p.age = 23;
		p.marry = true;*/

        p.setName("张三");
        System.out.println("p.name = " + p.getName());
        p.setAge(23);
        System.out.println("p.age = " + p.getAge());
        p.setMarry(true);
        System.out.println("p.marry = " + p.isMarry());
    }

}

class Person {
    private String name;
    private int age;
    private boolean marry;

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setAge(int a) {
        age = a;
    }

    public int getAge() {
        return age;
    }

    public void setMarry(boolean m) {
        marry = m;
    }

    public boolean isMarry() {
        return marry;
    }
}
