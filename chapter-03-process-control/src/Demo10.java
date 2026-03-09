/**
 * 章节案例10：百钱买鸡
 * 花100文钱买100只鸡。其中，公鸡5文1只、母鸡3文1只、小鸡1文3只
 * 花100文钱正好买100只鸡，该如何分配？
 *
 * @author Yu
 * @create 2026-03-09 22:42
 */
public class Demo10 {
    public static void main(String[] args) {
        int money = 100;
        // 1、公鸡总只数的最大可能性
        for (int gong = 0; gong <= money / 5; gong++) { // 如果全买公鸡最多20只
            // 2、母鸡总只数的可能性
            for (int mu = 0; mu < money / 3; mu++) { // 如果全买母鸡最多34只
                // 4、进行条件判断
                int xiao = 100 - gong - mu; // 如果全买小鸡最多300只
                if ((xiao % 3 == 0) && (gong * 5 + mu * 3 + xiao / 3 == 100)) {
                    System.out.println("公鸡有"+gong+"只，母鸡有"+mu+"只，小鸡有"+xiao+"只");
                }
            }
        }
    }
}
