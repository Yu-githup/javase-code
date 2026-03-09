/**
 * switch案例1
 * 返回数值1-3的英文,其他数值返回other
 *
 * @author Yu
 * @create 2026-03-09 20:40
 */
public class SwitchCaseDemo01 {
    public static void main(String[] args) {
        int num = -2;
        String str;

        switch (num) {
            case 0:
                str = "zero";
                break;
            case 1:
                str = "one";
                break;
            case 2:
                str = "two";
                break;
            case 3:
                str = "three";
                break;
            default:
                str = "other";
                break; // 可以省略
        }

        System.out.println(num + "的英文名称为：" + str);
    }
}
