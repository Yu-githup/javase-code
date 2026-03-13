package method_value_propagation;

/**
 *
 *
 * @author Yu
 * @create 2026-03-13 21:11
 */
public class PassObject {
    public static void main(String[] args) {
        PassObject passObject = new PassObject();
        passObject.printAreas(new Circle(),6);
    }
    /**
     * 打印面积
     */
    public void printAreas(Circle c, double time){
        System.out.println("Radius\t\t\tArea");
        for (double i = 1; i < time; i++) {
            c.radius = i;
            double area = c.findArea();
            System.out.println(i + "\t\t\t\t" + area);
        }
        System.out.println("now radius is :" + time);
    }
}
