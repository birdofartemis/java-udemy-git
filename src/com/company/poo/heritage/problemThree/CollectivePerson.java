package com.company.poo.heritage.problemThree;

public final class CollectivePerson extends Person{
    //Attributes
    private Integer numberEmployees;

    //Constructors
    public CollectivePerson() {
    }

    public CollectivePerson(String name, Double annualIncome, Integer numberEmployees) {
        super(name, annualIncome);
        this.numberEmployees = numberEmployees;
    }

    //Getters and Setters


    public Integer getNumberEmployees() {
        return numberEmployees;
    }

    public void setNumberEmployees(Integer numberEmployees) {
        this.numberEmployees = numberEmployees;
    }

    //Functions
    @Override
    public final double tax() {
        return (getNumberEmployees()> 10) ? (getAnnualIncome() * 0.14) : (getAnnualIncome() * 0.16);
    }
}
