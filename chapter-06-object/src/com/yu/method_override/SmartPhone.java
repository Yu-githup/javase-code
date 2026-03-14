package com.yu.method_override;

/**
 * 方法重写示例
 *
 * @author Yu
 * @create 2026-03-14 23:45
 */
public class SmartPhone extends Phone{
    @Override
    public void showNum() {
        //来电显示姓名和图片功能
        System.out.println("显示来电姓名");
        System.out.println("显示头像");
    }

    @Override
    public void call() {
        System.out.println("语言通话或视频通话");
    }

    public static void main(String[] args) {
        // 创建子类对象
        SmartPhone sp = new SmartPhone();
        // 调用父类继承而来的方法
        sp.call();
        // 调用子类重写的方法
        sp.showNum();
        sp.sendMessage(); // 由于没有重写调用父类的方法
    }
}
