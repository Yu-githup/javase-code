package com.yu.keyword._super.exer;

import com.yu.keyword._this.exer.Bank;

/**
 * 透支账户
 *
 * @author Yu
 * @create 2026-03-15 20:47
 */
public class CheckAccount extends Account{
    // 可透支金额
    private double overdraft;

    public double getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }

    public CheckAccount(int id, double balance, double annualInterestRate, double overdraft) {
        super(id, balance, annualInterestRate);
        this.overdraft = 5000;
        System.out.println("你的账户余额为：" + balance + ",可透支金额：" + overdraft);
    }

    @Override
    public void withdraw(double amount) {
        // 获取账户余额
        double balance = super.getBalance();
        // 余额充足
        if (amount < balance) {
            super.setBalance(balance - amount);
            System.out.println("成功取款" + amount + ",余额为：" + super.getBalance());
        } else if (amount > balance) {// 余额不足
            if (overdraft + balance > amount) {
                overdraft -= (amount - balance);
                super.setBalance(0);
                System.out.println("成功取款" + amount + ",余额为：" + super.getBalance());
            }else {
                System.out.println("超过可透支金额" + overdraft);
            }

        }
    }
}
