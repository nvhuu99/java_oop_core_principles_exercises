package example.bank;

public class CheckingAccount extends BankAccount {
    private double withdrawalLimit;

    public CheckingAccount(String accountNumber, String ownerName, double balance, double withdrawalLimit) {
        super(accountNumber, ownerName, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= getBalance() && amount <= withdrawalLimit) {
            super.withdraw(amount);
        } else {
            System.out.println("Withdrawal limit exceeded or insufficient balance.");
        }
    }

    public double getWithdrawalLimit() {
        return withdrawalLimit;
    }

    @Override
    public double calculateInterest() {
        return 0;
    }
}

