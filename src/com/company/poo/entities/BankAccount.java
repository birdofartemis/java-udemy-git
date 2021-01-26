package com.company.poo.entities;

public class BankAccount {
    private int accountNumber;
    private String holder;
    private double balance;
    private static final double TAX = 5.00;

    //Constructors
    public BankAccount(int accountNumber, String holder, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.holder = holder;
        depositValue(initialDeposit);
    }
    public BankAccount(int accountNumber, String holder) {
        this.accountNumber = accountNumber;
        this.holder = holder;
    }

    //Operations
    public void depositValue(double value){
        if(value > 0.00) {
            balance += value;
        }
    }
    public void withdrawValue(double value){
        if(value > 0.00) {
            balance -= (value + TAX);
        }
    }

    //Sets and gets
    public String getHolder() {
        return holder;
    }
    public void setHolder(String holder) {
        this.holder = holder;
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    public double getBalance() {
        return balance;
    }

    //@Override
    public String toString() {
        return  "Account " + accountNumber +
                ", Holder: " + holder +
                ", Balance: $ " + String.format("%.2f", balance);
    }
}
