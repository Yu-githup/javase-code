package object_array_exer;

/**
 * 矩形
 *
 * @author Yu
 * @create 2026-03-13 20:31
 */
public class Rectangle {
    double length;
    double width;

    public double area(){//面积
        return length * width;
    }

    public double perimeter(){//周长
        return 2 * (length + width);
    }

    public String getInfo(){
        return "长：" + length +"，宽：" + width +"，面积：" + area() +"，周长：" + perimeter();
    }
}
