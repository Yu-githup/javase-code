package method_value_propagation;

/**
 * 形参是引用数据类型时的方法值传递示例
 *
 * @author Yu
 * @create 2026-03-13 20:58
 */
public class MethodValueSendTest1 {
    public static void main(String[] args) {
        Data d1 = new Data();
        d1.m = 10;
        d1.n = 20;
        System.out.println("m = " + d1.m + ", n = " + d1.n);
        //实现 换序
        MethodValueSendTest1 test = new MethodValueSendTest1();
        test.swap(d1);
        System.out.println("m = " + d1.m + ", n = " + d1.n);
    }

    public void swap(Data data){
        int temp = data.m;
        data.m = data.n;
        data.n = temp;
    }
}

class Data{
    int m;
    int n;
}
