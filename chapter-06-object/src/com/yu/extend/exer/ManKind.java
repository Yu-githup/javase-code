package com.yu.extend.exer;

/**
 * 继承练习2
 *
 * @author Yu
 * @create 2026-03-14 23:22
 */
public class ManKind {
    int sex;
    int salary;

    void manOrWoman() {
        if (sex == 1) {
            System.out.println("man");
        } else if (sex == 0) {
            System.out.println("woman");
        }
    }

    void employeed() {
        if (salary == 0) {
            System.out.println("no job");
        } else {
            System.out.println("job");
        }
    }

}
