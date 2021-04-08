package com.company.poo.interfaces.defaultMethods.services;

import java.security.InvalidParameterException;

public interface InterestService {
    double getInterestRate();

    default double payment(double amount, int months){ //Useful to clean and flexible code
        if(months<1){
            throw new InvalidParameterException("Months must be greater that zero");
        }
        return amount * Math.pow(1.0 + getInterestRate() /100.0, months);
    }
}
