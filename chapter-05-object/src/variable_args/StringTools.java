package variable_args;

/**
 * 可变个数形参
 *
 * @author Yu
 * @create 2026-03-13 20:46
 */
public class StringTools {
    String concat(char separator, String... args){
        String str = "";
        for (int i = 0; i < args.length; i++) {
            if(i==0){
                str += args[i];
            }else{
                str += separator + args[i];
            }
        }
        return str;
    }
}
