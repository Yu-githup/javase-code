package com.yu.keyword._this.exer;

import java.util.Base64;

/**
 * this关键字练习2
 *
 * @author Yu
 * @create 2026-03-13 23:08
 */
public class Account {
    private double balance;

    public Account(double init_balance) {
        this.balance = init_balance;
    }

    public double getBalance() {
        return balance;
    }

    // 存钱
    public void deposit(double amt) {
        if (amt > 0){
            balance += amt;
            System.out.println("存钱成功,余额为：" + balance);
        }
    }

    // 取钱
    public void withdraw(double amt) {
        if (amt >= balance ) {
            balance -= amt;
            System.out.println("取款成功,余额为:" + balance);
        }else {
            System.out.println("余额不足,取款失败");
        }
    }
}
