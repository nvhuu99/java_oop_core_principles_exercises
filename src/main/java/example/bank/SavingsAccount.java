package example.bank;

public class SavingsAccount extends BankAccount {
    private double interestRate = 0.05; // 5% interest

    public SavingsAccount(String accountNumber, String ownerName, double interestRate, double balance) {
        super(accountNumber, ownerName, balance);
        this.interestRate = interestRate;
    }

    @Override
    public double getBalance() {
        return this.balance + calculateInterest();
    }

    @Override
    public double calculateInterest() {
        return balance * interestRate;
    }
}

