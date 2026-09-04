package com.joysistvi.stage1.day14;

public class LoadAccount {

    private double balance;

    public LoadAccount(double startingBalance) {
        this.balance = startingBalance;
    }

    public double getBalance() {
        return balance;
    }

    public boolean deduct(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }
}
