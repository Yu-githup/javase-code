/**
 * if案例3
 * 岳小鹏参加Java考试，他和父亲岳不群达成承诺：
 * 如果：
 * 成绩为100分时，奖励一辆跑车；
 * 成绩为(80，99]时，奖励一辆山地自行车；
 * 当成绩为[60,80]时，奖励环球影城一日游；
 * 其它时，胖揍一顿。
 *
 * 说明：默认成绩是在[0,100]范围内
 *
 * @author Yu
 * @create 2026-03-09 20:19
 */
public class IFElseDemo03 {
    public static void main(String[] args) {
        int score = 90;
        String str;

        // 写法1
        if (score == 100) {
            str = "奖励你一辆跑车";
        }else if (score > 80 && score <= 99){ // 错误的写法：}else if(80 < score <= 99){ 这种数学的写法不适合程序
            str = "奖励你一辆山地自行车";
        } else if (score >= 60 && score <= 80) {
            str = "奖励你环球影城一日游";
        }else {  // 最后一个else在这里不可以省略(因为这里公用一个变量,省略则最后不管进入那个if-else都会执行这个变量进行赋值)
            str = "你小子！准备挨揍吧";
        }
        System.out.println(str);

        // 写法2：需要注意的是。该写法不能交换条件表达式的执行顺序
        if (score == 100){
            str = "奖励你一辆跑车";
        } else if (score > 80) {
            str = "奖励你一辆山地自行车";
        } else if (score >= 60) {
            str = "奖励你环球影城一日游";
        }else { // 同理,不可以省略。
            str = "你小子！准备挨揍吧";
        }
        System.out.println(str);
    }
}
