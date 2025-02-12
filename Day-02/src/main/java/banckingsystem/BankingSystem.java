package banckingsystem;
import java.util.*;

public class BankingSystem {

    // Map to store customer accounts with account number as the key and balance as the value
    private Map<String, Double> customerAccounts;
    // TreeMap to store customers sorted by balance (ascending order)
    private Map<Double, List<String>> sortedByBalance;
    // Queue to store withdrawal requests
    private Queue<String> withdrawalQueue;

    public BankingSystem() {
        customerAccounts = new HashMap<>();
        sortedByBalance = new TreeMap<>();
        withdrawalQueue = new LinkedList<>();
    }

    // Add a new customer account
    public void addCustomerAccount(String accountNumber, double initialBalance) {
        customerAccounts.put(accountNumber, initialBalance);
        updateSortedByBalance(accountNumber);
    }

    // Update the TreeMap when a customer's balance changes
    private void updateSortedByBalance(String accountNumber) {
        double balance = customerAccounts.get(accountNumber);
        sortedByBalance.computeIfAbsent(balance, k -> new ArrayList<>()).add(accountNumber);
    }

    // Withdraw an amount from a customer account
    public void withdraw(String accountNumber, double amount) {
        if (!customerAccounts.containsKey(accountNumber)) {
            System.out.println("Account not found.");
            return;
        }

        double currentBalance = customerAccounts.get(accountNumber);
        if (currentBalance >= amount) {
            customerAccounts.put(accountNumber, currentBalance - amount);
            updateSortedByBalance(accountNumber);  // Update the TreeMap
            System.out.println("Withdrawal of " + amount + " from account " + accountNumber + " successful.");
        } else {
            System.out.println("Insufficient balance for withdrawal.");
        }
    }

    // Queue a withdrawal request
    public void queueWithdrawalRequest(String accountNumber, double amount) {
        withdrawalQueue.add(accountNumber);
        System.out.println("Withdrawal request for account " + accountNumber + " of amount " + amount + " queued.");
    }

    // Process withdrawal requests from the queue
    public void processWithdrawalRequests() {
        while (!withdrawalQueue.isEmpty()) {
            String accountNumber = withdrawalQueue.poll();
            System.out.println("Processing withdrawal request for account " + accountNumber);
        }
    }

    // View sorted list of customers by balance
    public void viewSortedByBalance() {
        System.out.println("\nCustomers sorted by balance: ");
        for (Map.Entry<Double, List<String>> entry : sortedByBalance.entrySet()) {
            double balance = entry.getKey();
            for (String accountNumber : entry.getValue()) {
                System.out.println("Account: " + accountNumber + " - Balance: " + balance);
            }
        }
    }

    // Display account details for a given account number
    public void displayAccountDetails(String accountNumber) {
        if (customerAccounts.containsKey(accountNumber)) {
            double balance = customerAccounts.get(accountNumber);
            System.out.println("Account: " + accountNumber + " - Balance: " + balance);
        } else {
            System.out.println("Account not found.");
        }
    }

    public static void main(String[] args) {
        BankingSystem bankingSystem = new BankingSystem();

        // Add customer accounts
        bankingSystem.addCustomerAccount("123", 1000.0);
        bankingSystem.addCustomerAccount("456", 500.0);
        bankingSystem.addCustomerAccount("789", 1500.0);

        // View customers sorted by balance
        bankingSystem.viewSortedByBalance();

        // Withdraw from an account
        bankingSystem.withdraw("123", 200.0);
        bankingSystem.withdraw("456", 600.0); // Insufficient balance

        // Queue withdrawal requests
        bankingSystem.queueWithdrawalRequest("123", 100.0);
        bankingSystem.queueWithdrawalRequest("789", 300.0);

        // Process queued withdrawal requests
        bankingSystem.processWithdrawalRequests();

        // View updated sorted customer balances
        bankingSystem.viewSortedByBalance();
    }
}
