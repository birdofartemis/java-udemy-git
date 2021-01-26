package com.company.poo.arrays;
import com.company.poo.entities.EmployeeField;

import java.util.*;

public class SalaryProblem {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);

        List<EmployeeField> employeeList = new ArrayList();

        createRecords(employeeList);
        printInOrder(employeeList);
        increaseSalary(employeeList);
        printInOrder(employeeList);
    }
    public static void createRecords(List<EmployeeField> employees){
        Scanner input = new Scanner(System.in);

        System.out.print("How many employees will be registered: ");
        int recordsNumber = input.nextInt();

        for(int i = 0; i<recordsNumber; i++){
            System.out.printf("Employee #%d\n", i+1);
            System.out.print("Id: ");
            int id = input.nextInt();
            while(hasId(employees, id)){
                System.out.println("Sorry... id already taken! Try again: ");
                System.out.print("Id: ");
                id = input.nextInt();
            }
            input.nextLine();

            System.out.print("Name: ");
            String name = input.nextLine();

            System.out.print("Salary: ");
            double salary = input.nextDouble();
            System.out.println();

            employees.add(new EmployeeField(id, name, salary));
        }
        employees.sort(Comparator.comparingInt(EmployeeField::getId));
    }
    public static void increaseSalary(List<EmployeeField> employees){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the employee id that will have salary increase: ");
        int id = input.nextInt();

        EmployeeField employee = employees.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

        if(employee != null){
            System.out.print("Enter de percentage: ");
            double percentage = input.nextDouble();

            employee.setSalary(percentage);
        }
        else {
            System.out.println("This id does not exist!");
        }

    }
    public static void printInOrder(List<EmployeeField> employees) {
        for (EmployeeField employeeField : employees) {
                System.out.println(employeeField);
        }
    }

    public static boolean hasId(List <EmployeeField> list, int id){
        EmployeeField employeeField = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return (employeeField != null);
    }
}
