package method_value_propagation;

/**
 * 圆
 *
 * @author Yu
 * @create 2026-03-13 21:10
 */
public class Circle {
    /**
     * 半径
     */
    double radius;

    /**
     * 圆的面积
     * @return 面积
     */
    public double findArea(){
        return Math.PI * radius * radius;
    }
}
