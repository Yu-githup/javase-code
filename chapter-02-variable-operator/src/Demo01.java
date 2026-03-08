/**
 * 章节案例1
 *
 * @author Yu
 * @create 2026-03-08 23:01
 */
public class Demo01 {
    public static void main(String[] args) {
        int liuXiaoBei = 23;
        int guanXiaoYu = 22;
        int zhangXiaoFei = 21;

        int tempMax = (liuXiaoBei > guanXiaoYu)? liuXiaoBei : guanXiaoYu;
        int maxAge = (tempMax > zhangXiaoFei)? tempMax : zhangXiaoFei;
        System.out.println("三人中最大的年龄是：" + maxAge);
    }
}
