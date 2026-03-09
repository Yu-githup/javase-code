/**
 * 死循环案例1
 *
 * @author Yu
 * @create 2026-03-09 22:06
 */
public class InfiniteLoopDemo01 {
    public static void main(String[] args) {
        for (;;){
            System.out.println("我爱Java");
        }
        // System.out.println("end"); java: unreachable statement:不可到达的语句,编译报错

    }
}
