package com.yu.keyword._super.exer;

/**
 * super关键字练习
 *
 * @author Yu
 * @create 2026-03-15 20:35
 */
public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    // 获取每月利息
    public double getMonthlyInterest() {
        return balance * annualInterestRate;
    }

    // 取钱
    public void withdraw(double amount) {
        if (balance >= amount ) {
            balance -= amount;
            System.out.println("取钱成功,余额为" + balance);
        }else {
            System.out.println("余额不足,余额为" + balance);
        }
    }

    // 存钱
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("存钱成功, 余额为" + balance);
        }
    }

}
