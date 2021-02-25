package com.company.poo.heritage.problemThree;

public abstract class Person {
    //Attributes
    private String name;
    private Double annualIncome;

    //Constructors
    public Person(String name, Double annualIncome) {
        this.name = name;
        this.annualIncome = annualIncome;
    }

    public Person() {
    }

    //Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAnnualIncome() {
        return annualIncome;
    }

    public void setAnnualIncome(Double annualIncome) {
        this.annualIncome = annualIncome;
    }

    //Functions
    public abstract double tax();

    @Override
    public String toString(){
        return getName() + ": $ " + String.format("%.2f", tax());
    }
}
