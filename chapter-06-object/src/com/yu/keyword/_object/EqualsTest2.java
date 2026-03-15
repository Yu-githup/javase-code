package com.yu.keyword._object;

/**
 * 练习3
 *
 * @author Yu
 * @create 2026-03-15 23:34
 */
public class EqualsTest2 {
    public static void main(String[] args) {
        MyDate m1 = new MyDate(2020, 02,11);
        MyDate m2 = new MyDate(2020, 02,11);
        System.out.println(m1.equals(m2));

        MyDate m3 = m2;
        System.out.println(m3.equals(m2));
    }
}

class MyDate {

    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }

        MyDate myDate = (MyDate) o;
        return year == myDate.year && month == myDate.month && day == myDate.day;
    }
}