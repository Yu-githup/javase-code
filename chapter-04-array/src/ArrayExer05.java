/**
 * 举例5：遍历扑克牌
 * 提示：使用两个字符串数组，分别保存花色和点数，再用一个字符串数组保存最后的扑克牌。
 * String[] hua = {"黑桃","红桃","梅花","方片"};
 * String[] dian = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
 *
 * @author Yu
 * @create 2026-03-10 23:03
 */
public class ArrayExer05 {
    public static void main(String[] args) {
        String[] hua = {"黑桃","红桃","梅花","方片"};
        String[] dian = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};


        String[] pai = new String[hua.length * dian.length];
        int k = 0;
        for(int i = 0;i < hua.length;i++){
            for(int j = 0;j < dian.length;j++){
                pai[k++] = hua[i] + dian[j];
            }
        }

        for (int i = 0; i < pai.length; i++) {
            System.out.print(pai[i] + "  ");
            if(i % 13 == 12){
                System.out.println();
            }
        }
    }
}
