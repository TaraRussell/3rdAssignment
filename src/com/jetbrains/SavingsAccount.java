package com.jetbrains;

public class SavingsAccount {
    public static double annualInterestRate = 0.0; // private class variable

    private double savingsBalance; // private instance variable

    public SavingsAccount(double amt) {
        this.savingsBalance = amt;
    }

    public void calculateMonthlyInterest() { // public instance method
        double interest;

        interest = (this.savingsBalance * (annualInterestRate / 100)) / 12;
        this.savingsBalance += interest;
    }

    public void showBalance() {
        System.out.printf("$%.2f", this.savingsBalance);
    }

    public static void modifyInterestRate(double newRate) {
        annualInterestRate = newRate;
    }

}
