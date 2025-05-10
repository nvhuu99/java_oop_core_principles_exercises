package example.bank;

public class Main {
    public static void main(String[] args) {
        CheckingAccount ca = new CheckingAccount("123456789", "Alice", 100000, 1000);
        ca.deposit(500.00);
        ca.withdraw(200.00);

        SavingsAccount sa = new SavingsAccount("123456789", "Bob", 0.07, 500);
        sa.deposit(500.00);
        sa.withdraw(200.00);

        System.out.println("Transaction info:\n");
        ca.displayAccountInfo();
        System.out.println("\nTransaction histories:\n");
        ca.displayTransactionHistory();

        System.out.println("\nTransaction info:\n");
        sa.displayAccountInfo();
        System.out.println("\nTransaction histories:\n");
        sa.displayTransactionHistory();

        // Display the transaction history in tabular format

    }
}
