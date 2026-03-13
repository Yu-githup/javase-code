package class_member.constructor.exer;

/**
 * 构造器练习3
 *
 * @author Yu
 * @create 2026-03-13 22:18
 */
public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account(1001, 5000, 1.8);
        System.out.println("当前余额为：" + account.getBalance());
        account.withdraw(5000);
        account.withdraw(100);

        account.deposit(1000);
        account.withdraw(100);

    }
}

class Account {
    private int id;
    private double balance;
    private double annualInterestRate;

    public Account(int i, double b, double a) {
        id = i;
        balance = b;
        annualInterestRate = a;
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

    // 取钱
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("成功取出：" + amount);
        }else {
            System.out.println("余额不足,取款失败");
        }
    }

    // 存钱
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("成功存入：" + amount);
        }
    }
}
