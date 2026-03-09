/**
 * 顺序结构的使用
 *
 * @author Yu
 * @create 2026-03-09 19:40
 */
public class SequentialStructureApply {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        // 对x、y的值进行修改。这种从上而下依次执行的流程就是顺序结构
        x++;
        y =  2 * x + y;
        x = x * 10;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
