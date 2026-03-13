package com.yu.keyword._this.exer;

/**
 * 顾客
 *
 * @author Yu
 * @create 2026-03-13 23:11
 */
public class Customer {
    private String firstName;
    private String lastName;
    private Account account;

    public Customer(String f, String l){
        this.firstName = f;
        this.lastName = l;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account){
        this.account = account;
    }
}
