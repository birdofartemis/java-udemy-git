package com.company.poo.exceptions.problemTwo;

import java.util.Locale;

public class Account {
    //Attributes
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    //Constructor
    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        if(!(number>0 && balance>=0.00 && withdrawLimit >=0.00)){
            throw new DomainException("Incorrect input values");
        }
        else {
            this.number = number;
            this.holder = holder;
            this.balance = balance;
            this.withdrawLimit = withdrawLimit;
        }
    }

    //Getters and Setters
    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    //Functions
    public void deposit(double amount){
        if(amount<=0.00){
            throw new DomainException("Must be a positive value");
        }
        balance+= amount;
    }
    public void withdraw(double amount){
        if(amount<=0.00 || amount> getWithdrawLimit()){
            throw new DomainException("Trespasses the withdraw limit or isn't a positive value");
        }
        if(amount<getBalance())
        balance-=amount;
    }
    public boolean correctValidation(){
        return (getNumber()>0 && getBalance()>=0.00 && getWithdrawLimit() >=0.00);
    }

    @Override
    public final String toString(){
        return "New Balance: $ " + String.format("%.2f", getBalance());
    }
}
