package com.company.poo.heritage.problemOne;

public class OutsourcedEmployee extends Employee {
    //Constants
    private static final Double BONUS = 1.1;

    //Attributes
    private Double additionalCharge;

    //Constructors
    public OutsourcedEmployee() {
    }

    public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    //Getters and Setters
    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    //Functions
    @Override
    public final Double payment() {
        return super.payment() + (BONUS *getAdditionalCharge());
    }
}
