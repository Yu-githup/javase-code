package class_member.constructor.exer;

/**
 * 构造器练习1
 *
 * @author Yu
 * @create 2026-03-13 22:03
 */
public class TriAngleTest {
    public static void main(String[] args) {
        TriAngle triAngle = new TriAngle(3, 4);
        System.out.println(triAngle.area());
    }
}

class TriAngle {
    private int base;
    private int height;

    public TriAngle(int inputBase, int inputHeight){
        base = inputBase;
        height = inputHeight;
    }

    public int area() {
        return base * height / 2;
    }
}
