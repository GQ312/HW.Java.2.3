package com.company;

public class BankAmount {

    private double amount;

    public BankAmount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum) {
        this.amount = getAmount() + sum;
    }

    public void withDraw(int sum) throws LimitException {
        if (amount - sum < 0) {
            throw new LimitException("Money is not enough!",2);
        }
        amount -= sum;
    }
}
