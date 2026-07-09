package Q4;

import java.util.Date;

public class Transaction {

    // Data fields
    private Date date;
    private char type;        // 'W' for withdrawal, 'D' for deposit
    private double amount;
    private double balance;
    private String description;

    // Constructor
    public Transaction(char type, double amount, double balance, String description) {
        this.date = new Date(); // current date
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
    }

    // Getter methods
    public Date getDate() {
        return date;
    }

    public char getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    public double getBalance() {
        return balance;
    }

    public String getDescription() {
        return description;
    }

    // Setter methods
    public void setType(char type) {
        this.type = type;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // Optional: toString() method for easy display
    @Override
    public String toString() {
        return "Transaction{" +
                "date=" + date +
                ", type=" + type +
                ", amount=" + amount +
                ", balance=" + balance +
                ", description='" + description + '\'' +
                '}'+'\n';
    }
}