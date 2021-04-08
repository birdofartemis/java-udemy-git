package com.company.poo.interfaces.ex2.models.services;

public class PaypalService implements PaymentOnlineService{
    @Override
    public double totalTax(double amount, int month) {
        return (amount*0.01 * month) + (amount*0.02);
    }
}
