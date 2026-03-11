package method_exer;

import java.util.Scanner;

/**
 * 用户类
 *
 * @author Yu
 * @create 2026-03-11 23:15
 */
public class UserTest {
    public static void main(String[] args) {
        User user = new User();
        user.username = "tom";
        user.password = "123456";
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入用户名:");
        String username = scan.next();
        System.out.println("请输入用户密码");
        String password = scan.next();

        user.login(username, password);
    }
}

class User {
    String username;
    String password;


    public void  login(String username, String password) {
        if(this.username.equals(username) && this.password.equals(password))				{
            System.out.println("登录成功：欢迎你，" + username);
        }else{
            System.out.println("登录失败：用户名或密码错误！");
        }

        // 简化版
        // return name.equals(inputName) && password.equals(inputPwd);
    }
}
