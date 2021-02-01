package com.company.poo;

import com.company.poo.entities.Department;
import com.company.poo.entities.HourContract;
import com.company.poo.entities.Worker;
import com.company.poo.entities.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class WorkerProblem {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);

      Worker worker = addWorker();
      createContract(worker);
      totalIncome(worker);

    }

    public static Worker addWorker(){
        Scanner input = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        String department, name, level;
        double baseSalary;

        System.out.print("Enter the department's name: ");
        department = input.nextLine();
        System.out.println("Enter worker data: ");
        System.out.print("Name: ");
        name = input.nextLine();
        System.out.print("Level: ");
        level = input.nextLine();
        System.out.print("Base Salary: ");
        baseSalary = input.nextDouble();
        System.out.println();


        return new Worker(name, WorkerLevel.valueOf(level), baseSalary, new Department(department));
    }

    public static void createContract(Worker worker) throws ParseException {
        Scanner input = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Date date;
        double valuePerHour;
        int hours, numberOfContracts;

        System.out.println("How many contracts? ");
        numberOfContracts = input.nextInt();

        for(int i = 0; i<numberOfContracts; i++){
            System.out.println("Enter contract data: #" + (i+1));
            System.out.print("Date (dd/MM/yyyy): ");
            date = sdf.parse(input.next());
            System.out.print("Value per Hour: ");
            valuePerHour = input.nextDouble();
            System.out.print("Duration hour(s): ");
            hours = input.nextInt();
            System.out.println();

            worker.addContract(new HourContract(date, valuePerHour, hours));
        }
    }

    public static void totalIncome(Worker worker){
        Scanner input = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        String monthAndYear;
        int month, year;

        System.out.print("Enter the date (MM/yyyy): ");
        monthAndYear = input.next();
        month = Integer.parseInt(monthAndYear.substring(0, 2));
        year = Integer.parseInt(monthAndYear.substring(3));
        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getDepartmentName());
        System.out.println("Income for " + monthAndYear + ": $ " +
                String.format("%.2f", worker.income(year, month)));
    }
}
