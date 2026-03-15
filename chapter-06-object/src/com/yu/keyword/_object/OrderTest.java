package com.yu.keyword._object;

import java.util.Objects;

/**
 * 练习2
 *
 * @author Yu
 * @create 2026-03-15 23:24
 */
public class OrderTest {
    public static void main(String[] args) {
        Order o1 = new Order(1,"a");
        Order o2 = new Order(2,"b");
        System.out.println(o1.equals(o2)); // false

        o2 = o1;
        System.out.println(o1.equals(o2)); // true
    }
}

class Order {
    private int orderId;
    private String orderName;

    public Order() {

    }

    public Order(int orderId, String orderName) {
        this.orderId = orderId;
        this.orderName = orderName;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        Order order = (Order) o;
        return orderId == order.orderId && Objects.equals(orderName, order.orderName);
    }

}
