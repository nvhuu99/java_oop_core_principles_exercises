package example.bank;

public abstract class BankAccount {
    protected String accountNumber;
    protected String ownerName;
    protected double balance;
    protected TransactionHistory transactionHistory;  // Store TransactionHistory

    public abstract double calculateInterest();

    // Constructor
    public BankAccount(String accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
        this.transactionHistory = new TransactionHistory();  // Initialize transaction history
    }
    // Deposit method
    public void deposit(double amount) {
        this.balance += amount;
        Transaction transaction = new Transaction("Deposit", amount);
        transactionHistory.addTransaction(transaction);
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount <= balance) {
            this.balance -= amount;
            Transaction transaction = new Transaction("Withdrawal", amount);
            transactionHistory.addTransaction(transaction);
        } else {
            System.out.println("Insufficient balance for withdrawal.");
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public void displayAccountInfo() {
        System.out.printf("| Account Number  | Owner           | Balance    |\n");
        System.out.printf("|-----------------|-----------------|------------|\n");
        System.out.printf("| %-15s | %-15s | %-10.2f |\n", accountNumber, ownerName, getBalance());
    }

    // Display transaction history in tabular format
    public void displayTransactionHistory() {
        System.out.println("| Transaction Type | Amount    | Date                |");
        System.out.println("|------------------|-----------|---------------------|");

        // Use foreach to iterate through the list of transactions
        for (Transaction transaction : transactionHistory.getTransactions()) {
            System.out.printf("| %-16s | %-9.2f | %-19s |\n",
                    transaction.getType(),
                    transaction.getAmount(),
                    transaction.getDate());
        }
    }
}
