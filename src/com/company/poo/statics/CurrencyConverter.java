package com.company.poo.statics;

public class CurrencyConverter {
    public static final double IOF = 0.06;

    public static double dollarsToReais(double priceUnit, double quantity){
        return (priceUnit*quantity) + (priceUnit*quantity*IOF);
    }
}
