package com.company.poo.interfaces.initialExercice.model.services;

public class BrazilTaxService implements TaxService {
    public double tax(double amount){
        return (amount<= 100) ? amount * 0.2 : amount * 0.15;
    }
}
