package com.company.poo.entities;

public class EmployeeField {
    private final Integer id;
    private String name;
    private Double salary;

    public EmployeeField(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    private double increaseSalary(double percentage){
        return salary += (salary*(percentage/100));
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

    public void setSalary(Double percentage) {
        this.salary = increaseSalary(percentage);
    }

    public Integer getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Id: " + id +
                "\nName: " + name +
                "\nSalary: $ " + String.format("%.2f", salary) +
                "\n";
    }
}
