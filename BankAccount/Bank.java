
class InnerBank {
    private long accountNumber;
    private double balance;
    private static long totalAccounts;
    private static double totalBalance; 

    public InnerBank(long accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        InnerBank.totalAccounts++;
        InnerBank.totalBalance += balance;
    }

    public void deposit(long deposit){
        this.balance += deposit;
        InnerBank.totalBalance += deposit;
    }
    public void withdraw(long withdraw){
        if (this.balance >= withdraw) {
            this.balance -= withdraw;
            InnerBank.totalBalance -= withdraw;
        }
        else{
            System.out.println("Insufficient Balance");
        }
    }

    public void display(){
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Balance: "+balance);
        System.out.println("Total Accounts: "+InnerBank.totalAccounts);
        System.out.println("Total Balance: "+InnerBank.totalBalance);
    }
    
}

public class Bank {
    public static void main(String[] args) {
        InnerBank p1 = new InnerBank(2345643534L, 100000);
        InnerBank p2 = new InnerBank(3242353435L, 200000);
        InnerBank p3 = new InnerBank(3242353345L, 150000);
        p1.deposit(1000);
        p1.display();
        p1.withdraw(500);
        p1.display();
        p2.deposit(2000);
        p2.display();
        p2.withdraw(1000);
        p2.display();
        p3.deposit(3000);
        p3.display();
        p3.withdraw(20000000);
        p3.display();
        
    }
}
