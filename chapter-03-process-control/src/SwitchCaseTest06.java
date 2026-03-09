/**
 * switch练习6
 *
 * @author Yu
 * @create 2026-03-09 20:59
 */
public class SwitchCaseTest06 {
    public static void main(String[] args) {
        int a = 3;
        int x = 100;

        switch(a){
            case 1:
                x += 5;
                break;
            case 2:
                x += 10;
                break;
            case 3:
                x += 16;
                break;
            default :
                x += 34;
        }
    }
}
