import java.util.ArrayList;
import java.util.List;

/**
 * 内存泄漏案例：静态List持有大量对象，无法被GC回收
 *
 * @author Yu
 * @create 2026-03-08 17:56
 */
public class MemoryLeakExample {
    // 静态集合（GC Roots），生命周期与JVM一致
    private static List<BigObject> leakList = new ArrayList<>();

    // 自定义大对象（方便观察内存占用）
    static class BigObject {
        // 占用100KB内存的字节数组
        private byte[] data = new byte[1024 * 100];
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("开始添加对象到静态集合...");
        // 循环添加10000个大对象到静态集合
        for (int i = 0; i < 10000; i++) {
            leakList.add(new BigObject());
            // 每添加1000个打印一次，观察内存变化
            if (i % 1000 == 0) {
                System.out.println("已添加 " + i + " 个对象");
                Thread.sleep(100); // 放慢速度，方便观察
            }
        }

        // 关键：即使后续不再使用leakList，也不清理
        System.out.println("对象添加完成，此时静态集合仍持有所有对象引用！");

        // 模拟程序继续运行（内存不会释放）
        while (true) {
            Thread.sleep(1000);
        }
    }
}
