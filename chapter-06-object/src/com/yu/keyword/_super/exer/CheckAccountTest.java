package com.yu.keyword._super.exer;

/**
 * 测试
 *
 * @author Yu
 * @create 2026-03-15 20:59
 */
public class CheckAccountTest {
    public static void main(String[] args) {
        CheckAccount checkAccount = new CheckAccount(1122,20000,0.045,5000);
        checkAccount.withdraw(15000);
        checkAccount.withdraw(18000);
        checkAccount.withdraw(3000);
        checkAccount.withdraw(6000);
        System.out.println(checkAccount.getOverdraft());
    }
}
