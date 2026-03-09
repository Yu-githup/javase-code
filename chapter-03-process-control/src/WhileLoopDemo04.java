/**
 * while循环案例4
 * 世界最高山峰是珠穆朗玛峰，它的高度是8848.86米，假如我有一张足够大的纸，它的厚度是0.1毫米。
 * 请问，我折叠多少次，可以折成珠穆朗玛峰的高度?
 *
 * @author Yu
 * @create 2026-03-09 21:35
 */
public class WhileLoopDemo04 {
    public static void main(String[] args) {
        // 将毫米转换为米
        double paper = 0.0001;
        double zf = 8848.86;

        int count = 0;
        while (paper < zf) {
            paper *= 2;
            count++;
        }

        System.out.println("当折叠" + count + "次时,纸张厚度为" + paper + ",超过珠穆朗玛峰");
    }
}
