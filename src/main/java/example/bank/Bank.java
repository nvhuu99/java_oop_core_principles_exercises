package example.bank;

import java.util.HashMap;
import java.util.Map;

public class Bank {
    private Map<String, BankAccount> accounts = new HashMap<>();
    private double totalBalance;

    public void addAccount(BankAccount account) {
        accounts.put(account.getAccountNumber(), account);
        totalBalance += account.getBalance();
    }

    public void deposit(String accountNumber, double amount) {
        BankAccount account = accounts.get(accountNumber);
        if (account != null) {
            account.deposit(amount);  // This will log the transaction
            totalBalance += amount;
        } else {
            System.out.println("Account not found.");
        }
    }

    public void withdraw(String accountNumber, double amount) {
        BankAccount account = accounts.get(accountNumber);
        if (account != null) {
            account.withdraw(amount);  // This will log the transaction
            totalBalance -= amount;
        } else {
            System.out.println("Account not found.");
        }
    }

    public void calculateTotalBalance() {
        System.out.println("Total balance in the bank: " + totalBalance);
    }

    public void displayAccountInfo(String accountNumber) {
        BankAccount account = accounts.get(accountNumber);
        if (account != null) {
            account.displayAccountInfo();
            account.displayTransactionHistory();  // Print transaction history
        } else {
            System.out.println("Account not found.");
        }
    }
}
