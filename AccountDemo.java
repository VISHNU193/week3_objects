import java.math.BigInteger;

/**
 * Account
 */
class Account {
    private static long totalAccounts;
    private static double totalSalary;
    private long accountId;
    private double salary;
    public Account(){
        Account.totalAccounts=0;
        Account.totalSalary=0;
    }

    public Account(long accountId, double salary) {
        this();
        this.accountId= accountId;
        this.salary = salary;
        Account.totalAccounts++;
        Account.totalSalary += salary;
    }

    public void display(){
        System.out.println("Account Id: "+accountId);
        System.out.println("Salary: "+salary);
        System.out.println("Total Accounts: "+Account.totalAccounts);
        System.out.println("Total Salary: "+Account.totalSalary);
    }

}
public class AccountDemo {
    public static void main(String[] args) {
        Account p1 = new Account(2345643534L, 100000);
        Account p2 = new Account(3242353435L, 200000);
        Account p3 = new Account(3242353345L, 150000);
        p1.display();
        p2.display();
        p3.display();
    }
}
