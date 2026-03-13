package class_member.constructor.exer;

/**
 * 构造器练习4
 *
 * @author Yu
 * @create 2026-03-13 22:26
 */
public class CustomerTest {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Jane", "Smith");
        Account account = new Account(1000, 2000, 1.23);
        customer1.setAccount(account);
        account.deposit(100);
        account.withdraw(960);
        account.withdraw(2000);
        customer1.getCustomerInfo();
    }
}

class Customer {
    private String firstName;
    private String lastName;
    private Account account;

    public Customer(String f, String l) {
        firstName = f;
        lastName = l;
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

    public void setAccount(Account a) {
        account = a;
    }

    public void getCustomerInfo(){
        System.out.println("Customer [" + firstName + "," + lastName + "] has a account: " +
                "id is " + account.getId() + ", annualInterestRate is " + account.getAnnualInterestRate()
                + "%, balance is " + account.getBalance());
    }
}
