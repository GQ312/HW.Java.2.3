package com.company;

public class LimitException extends Exception {

    String message;
    double remainingAmount;

    public LimitException(String message, double remainingAmount) {
        this.message = message;
        this.remainingAmount = remainingAmount;
    }

    public static void getRemainingAmount() {

    }
}

