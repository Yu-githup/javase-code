/**
 * 变量的使用事项
 *
 * @author Yu
 * @create 2026-03-08 21:08
 */
public class Variable {
    public static void main(String[] args) {
        // number = 10; 编译不通过
        int number;
        number = 10;

        byte myAge = 12;
        System.out.println(myAge);
        byte b1 = 12;
        byte b2 = 127;
        // 编译不通过。因为超出了byte的存储范围
        // byte b3 = 128;

        char gender = '男';
        // name = "李四"; 编译不通过,作用域内没有声明的变量

        String username = "张三";
        // String username = "李四"; 编译不通过

        username = "王五";
        System.out.println(username);

        byte maxValue = 127;
        // maxValue= 128; 超出byte范围,编译不通过
        System.out.println(maxValue);
    }

    public static void main123(String[] args){
        // System.out.println("gender = " + gender); 编译不通过,作用域内没有声明的变量
        String name = "张三";
    }
}
