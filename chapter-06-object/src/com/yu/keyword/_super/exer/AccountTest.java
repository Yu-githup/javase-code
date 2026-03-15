package com.yu.keyword._super.exer;

/**
 * 测试类
 *
 * @author Yu
 * @create 2026-03-15 20:43
 */
public class AccountTest {
    public static void main(String[] args) {
        Account account1 = new Account(1122,20000,0.045);
        account1.withdraw(30000);
        account1.withdraw(2500);
        account1.deposit(3000);
        System.out.println("月利率为：" + account1.getAnnualInterestRate());
    }
}
