package com.yu.keyword._object;

/**
 * finalize方法使用
 *
 * @author Yu
 * @create 2026-03-15 23:56
 */
public class FinalizeTest {
    public static void main(String[] args) {
        Person1 p = new Person1("Peter", 12);
        System.out.println(p);
        p = null;//此时对象实体就是垃圾对象，等待被回收。但时间不确定。
        System.gc();//强制性释放空间
    }
}

class Person1 {
    private String name;
    private int age;

    public Person1(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //子类重写此方法，可在释放对象前进行某些操作
    @Override
    protected void finalize() throws Throwable {
        System.out.println("对象被释放--->" + this);
    }

    @Override
    public String toString() {
        return "Person1 [name=" + name + ", age=" + age + "]";
    }

}
