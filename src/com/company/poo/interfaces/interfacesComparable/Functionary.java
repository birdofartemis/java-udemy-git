package com.company.poo.interfaces.interfacesComparable;

public class Functionary implements Comparable<Functionary> {
    private String name;
    private Double salary;

    public Functionary(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString(){
        return "Functionary: " + getName() +", " + String.format("%.2f", getSalary()) + "€";
    }

    @Override
    public int compareTo(Functionary otherFunctionary) {
        return -salary.compareTo(otherFunctionary.getSalary());
    }
}
