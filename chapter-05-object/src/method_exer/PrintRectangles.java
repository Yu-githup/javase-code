package method_exer;

/**
 * 打印矩形
 *
 * @author Yu
 * @create 2026-03-11 23:00
 */
public class PrintRectangles {
    public static void main(String[] args) {
        Rectangles r1 = new Rectangles();
        r1.print();
        System.out.println("-------------");
        int area = r1.area();
        System.out.println("面积为:" + area);
        System.out.println("-------------");
        r1.print(10, 8);
    }
}

class Rectangles {
    public void print() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public int area() {
        print();
        return 10 * 8;
    }

    public void print(int m, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


}
