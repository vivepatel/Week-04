package junit.adancedproblem.bankingtransactions;



public class BankAccount {

    private double balance;

    public BankAccount() {
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public boolean withdraw(double amount) {
        if (amount <= balance && amount > 0) {
            balance -= amount;
            return true;
        }
        return false; // Insufficient funds or invalid amount
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(1000);
        System.out.println("Balance: " + account.getBalance());
        if (account.withdraw(500)) {
            System.out.println("Withdrawal Successful. Remaining Balance: " + account.getBalance());
        } else {
            System.out.println("Insufficient funds for withdrawal.");
        }
    }
}