/**
 * 字符串类型练习
 *
 * @author Yu
 * @create 2026-03-08 22:13
 */
public class InformationRegistrationPractice {
    public static void main(String[] args) {
        String name = "张三";
        int age = 37;
        char gender = '男';
        double weight = 145.6;
        boolean isMarried = true;
        String phoneNumber = "13112341234";
        System.out.println("姓名：" + name);
        System.out.println("年龄：" + age);
        System.out.println("性别：" + gender);
        System.out.println("体重：" + weight);
        System.out.println("婚否：" + isMarried);
        System.out.println("电话：" + phoneNumber);
        // 如上的输出语句也可以替换为下面这种方式
        System.out.println("name = " + name + ", age = " + age + ", gender = " + gender + ", weight = " + weight + ", isMarried = " + isMarried +
                ", phoneNumber = " + phoneNumber);
    }
}
