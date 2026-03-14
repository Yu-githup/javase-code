package com.yu.method_override;

/**
 * 方法重写示例
 *
 * @author Yu
 * @create 2026-03-14 23:44
 */
public class Phone {
    public void sendMessage(){
        System.out.println("发短信");
    }
    public void call(){
        System.out.println("打电话");
    }
    public void showNum(){
        System.out.println("来电显示号码");
    }
}
