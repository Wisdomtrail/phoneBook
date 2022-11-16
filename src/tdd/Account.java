 package tdd;

public class Account {
    private int balance;
    private String pin = "1234";

    public Account(int initialDeposit) {
        balance = initialDeposit;
    }

    public void deposit(int amount, String pin) {
        if(pin.equals(this.pin)) {
            if (amount > 0) {
                balance = balance + amount;
            }
        }
    }

    public int getBalance() {
        return balance;
    }

    public void withdraw(int amount, String pin) {
        if (pin.equals(this.pin)) {
            if (amount > 0) {
                balance = balance - amount;
            }
        }
    }
    public void withdrawMoreThanBalance(int amount) {

        if (balance >= amount) {
            balance = balance - amount;
        }
    }
}