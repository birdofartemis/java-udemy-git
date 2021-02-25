package com.company.poo.heritage.problemOne;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class GesEmployee {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        char isOutsourced;
        List<Employee> list = new ArrayList();

        System.out.print("Enter the number of employees: ");
        byte numberEmployees = input.nextByte();

        for(byte i = 0; i<numberEmployees; i++){
            System.out.println("\nEmployee #" + (i+1) + " data: ");
            do {
                System.out.print("Outsourced (y/n): ");
                isOutsourced = input.next().toLowerCase().charAt(0);
            }while (isOutsourced != 'y' && isOutsourced != 'n');

            if(isOutsourced == 'y'){
                createOutsourcedEmployee(list);
            }
            else{
                createEmployee(list);
            }
        }
        printList(list);

        input.close();
    }

    public static void createEmployee(List<Employee> employeeList){
        Scanner input = new Scanner(System.in);

        System.out.print("Name: ");
        String name = input.nextLine();
        System.out.print("Hours: ");
        int hours = input.nextInt();
        System.out.print("Value per hour: ");
        double valuePerHours = input.nextDouble();

        Employee employee = new Employee(name, hours, valuePerHours);
        employeeList.add(employee);
    }

    public static void createOutsourcedEmployee(List<Employee> employeeList){
        Scanner input = new Scanner(System.in);

        System.out.print("Name: ");
        String name = input.nextLine();
        System.out.print("Hours: ");
        int hours = input.nextInt();
        System.out.print("Value per hour: ");
        double valuePerHours = input.nextDouble();
        System.out.print("Additional charge: ");
        double additionalCharge = input.nextDouble();

        Employee employee = new OutsourcedEmployee(name, hours, valuePerHours, additionalCharge);
        employeeList.add(employee);
    }

    public static void printList(List<Employee> employeeList){
        System.out.println("PAYMENTS:");
        for(Employee employee : employeeList){
            System.out.println(employee);
        }
    }
}
