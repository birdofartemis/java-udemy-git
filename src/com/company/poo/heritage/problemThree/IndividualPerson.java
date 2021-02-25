package com.company.poo.heritage.problemThree;

public final class IndividualPerson extends Person {
    //Attributes
    private Double healthExpenditures;

    //Constructors
    public IndividualPerson() {
    }

    public IndividualPerson(String name, Double annualIncome, Double healthExpenditures) {
        super(name, annualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    //Getters and Setters
    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    //Functions
    @Override
    public final double tax() {
        return (getAnnualIncome() >= 20000.00) ? (getAnnualIncome() * 0.25) - (getHealthExpenditures() * 0.5) :
                (getAnnualIncome() * 0.15) - (getHealthExpenditures() * 0.5);
    }
}
