/**
 * 评委打分
 *
 * @author Yu
 * @create 2026-03-10 22:44
 */
public class ArrayExer {
    public static void main(String[] args) {
        int[] scores = {5,4,6,8,9,0,1,2,7,3};

        int max = scores[0];
        int min = scores[0];
        int sum = 0;
        for(int i = 0;i < scores.length;i++){
            if(max < scores[i]){
                max = scores[i];
            }

            if(min > scores[i]){
                min = scores[i];
            }

            sum += scores[i];
        }

        double avg = (double)(sum - max - min) / (scores.length - 2);

        System.out.println("选手去掉最高分和最低分之后的平均分为：" + avg);
    }
}
