/**
 * 内存泄漏案例：创建大量线程但不终止，线程对象无法被回收
 *
 * @author Yu
 * @create 2026-03-08 17:57
 */
public class ThreadMemoryLeak {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10000; i++) {
            // 创建线程但不启动/不终止，线程对象被ThreadGroup引用
            Thread thread = new Thread(() -> {
                try {
                    Thread.sleep(Integer.MAX_VALUE); // 线程永久阻塞
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            thread.start(); // 启动线程，线程进入运行状态
            if (i % 1000 == 0) {
                System.out.println("已创建 " + i + " 个线程");
                Thread.sleep(100);
            }
        }
        // 线程未终止，ThreadGroup一直持有引用，内存泄漏
    }
}
