package com.yu.extend.exer;

/**
 * 继承练习2测试类
 *
 * @author Yu
 * @create 2026-03-14 23:28
 */
public class KidsTest {
    public static void main(String[] args) {
        Kids someKid = new Kids();
        someKid.sex = 1;
        someKid.manOrWoman();

        someKid.salary = 1;
        someKid.employeed();
    }
}
