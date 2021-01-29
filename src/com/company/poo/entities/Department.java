package com.company.poo.entities;

public class Department {
    private String departmentName;

    public Department(String departmentName) {
        this.departmentName = departmentName;
    }

    public Department() {
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
