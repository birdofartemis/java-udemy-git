package com.company.poo.entities;

import com.company.poo.entities.enums.WorkerLevel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {
    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    private Department department;
    private List<HourContract> contractsList = new ArrayList();

    public Worker() {
    }
    public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<HourContract> getContractsList() {
        return contractsList;
    }

    public void addContract(HourContract contract){
        contractsList.add(contract);
    }
    public void removeContract(HourContract contract){
        contractsList.removeIf(x -> x.equals(contract));
    }
    public double income(int year, int month){
        double sum = baseSalary;
        Calendar calendar = Calendar.getInstance();

        for(HourContract values : contractsList){
            calendar.setTime(values.getDate());
            int value_year = calendar.get(Calendar.YEAR);
            int value_month = calendar.get(Calendar.MONTH) + 1;

            if(value_year == year && value_month == month){
                sum+= values.totalValue();
            }
        }
        return  sum;
    }
}
