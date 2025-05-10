package example.bank;

import java.time.LocalDateTime;

public class Transaction {
    private String type;
    private double amount;
    private LocalDateTime date;

    // Constructor
    public Transaction(String type, double amount) {
        this.type = type;
        this.amount = amount;
        this.date = LocalDateTime.now();  // Automatically set the current date and time
    }

    // Getter methods
    public String getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDateTime getDate() {
        return date;
    }

    // Override toString method to display transaction info in tabular format
    @Override
    public String toString() {
        return String.format("| %-10s | %-10.2f | %-19s |", type, amount, date);
    }
}

