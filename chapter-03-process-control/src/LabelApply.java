/**
 * 循环标签的使用
 *
 * @author Yu
 * @create 2026-03-09 22:20
 */
public class LabelApply {
    public static void main(String[] args) {
        l:for(int i = 1;i <= 4;i++){
            for(int j = 1;j <= 10;j++){
                if(j % 4 == 0){
                    //break l;
                    continue l;
                }
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
