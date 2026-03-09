import java.util.Scanner;

/**
 * 章节案例6：彩票中奖
 * 1)如果用户输入的数匹配彩票的实际顺序，奖金10 000美元。
 * 2)如果用户输入的所有数字匹配彩票的所有数字，但顺序不一致，奖金 3 000美元。
 * 3)如果用户输入的一个数字仅满足顺序情况下匹配彩票的一个数字，奖金1 000美元。
 * 4)如果用户输入的一个数字仅满足非顺序情况下匹配彩票的一个数字，奖金500美元。
 * 5)如果用户输入的数字没有匹配任何一个数字，则彩票作废。

 * 提示：使用Math.random() 产生随机数
 * Math.random() 产生[0,1)范围的随机值
 * Math.random() * 90：产生[0,90) 范围的随机值
 * Math.random() * 90 + 10：产生[10,100) 即得到 [10,99]范围的随机值
 * 使用(int)(Math.random() * 90  + 10)产生一个两位数的随机数。
 *
 * @author Yu
 * @create 2026-03-09 22:35
 */
public class Demo06 {
    public static void main(String[] args) {
        // 1、随机地产生一个两位数的彩票
        int rand = (int) (Math.random() * 90 + 10);//[10,99]

        // 2、提示用户输入一个两位数
        Scanner input = new Scanner(System.in);
        System.out.print("请输入两位数的彩票号码：");
        int num = input.nextInt();
        input.close();

        // 3、处理数字
        int randShi = rand / 10;
        int randGe = rand % 10;
        int numShi = num / 10;
        int numGe = num % 10;

        // 4、判断
        String str;
        if (num == rand) {
            str = "奖金10 000美元";
        } else if (randShi == numGe && randGe == numShi) {
            str = "奖金3 000美元";
        } else if (randShi == numShi || randGe == numGe) {
            str = "奖金1 000美元";
        } else if (randShi == numGe || randGe == numShi) {
            str = "奖金500美元";
        } else {
            str = "彩票作废";
        }

        System.out.println(str);
        System.out.println("本次号码：" + rand);
    }
}
