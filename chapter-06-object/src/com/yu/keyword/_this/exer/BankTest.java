package com.yu.keyword._this.exer;

/**
 * 测试类
 *
 * @author Yu
 * @create 2026-03-13 23:22
 */
public class BankTest {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.addCustomer("Jane", "Smith");
        bank.getCustomer(0).setAccount(new Account(3000));
        double balance = bank.getCustomer(0).getAccount().getBalance();
        System.out.println(balance);
        System.out.println(bank.getCustomer(0).getFirstName());
        bank.getCustomer(0).getAccount().deposit(10000);
        System.out.println(bank.getCustomer(0).getAccount().getBalance());
    }
}
