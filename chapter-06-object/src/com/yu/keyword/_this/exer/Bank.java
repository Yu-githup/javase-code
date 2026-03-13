package com.yu.keyword._this.exer;

/**
 * 银行
 *
 * @author Yu
 * @create 2026-03-13 23:13
 */
public class Bank {
    private Customer[] customer = new Customer[10];
    private int numberOfCustomer;

    public Bank(){
        numberOfCustomer = 0;
    }

    public void addCustomer(String f, String l){
        customer[numberOfCustomer++] = new Customer(f,l);
    }

    public Customer getCustomer(int index) {
        return customer[index];
    }

    public int getNumberOfCustomer() {
        return numberOfCustomer;
    }
}
