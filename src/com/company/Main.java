package com.company;

public class Main {

    public static void main(String[] args) throws LimitException {

        BankAmount account = new BankAmount(20000);
        System.out.println(account.getAmount());
        while (account.getAmount() > 0) {
            try {
                account.withDraw(6000);
                System.out.println("Lost: " + account.getAmount());

            } catch (LimitException e) {
                account.withDraw((int) account.getAmount());
                System.out.println("Available money: " + account.getAmount());
            }

        }

    }
}
