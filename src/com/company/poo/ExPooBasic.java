package com.company.poo;
import com.company.poo.entities.*;
import com.company.poo.statics.CurrencyConverter;
import java.util.Locale;
import java.util.Scanner;

public class ExPooBasic {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);

        System.out.println(String.format("%.2f", CurrencyConverter.dollarsToReais(3.10, 200.00)));

    }

    public static void rectangleEx(){
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();

        do {
            System.out.println("Enter the width and the height:");
            rectangle.height = input.nextDouble();
            rectangle.width = input.nextDouble();

            if(rectangle.width <= 0 || rectangle.height <= 0){
                System.out.println("Error... Try again");
            }
        }while(rectangle.width <= 0 || rectangle.height <= 0);

        System.out.println(rectangle);

        input.close();
    }

    public static void employeeEx(){
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.print("Name: ");
        employee.name = input.nextLine();
        System.out.print("Gross salary: ");
        employee.grossSalary = input.nextDouble();
        System.out.print("Tax: ");
        employee.tax = input.nextDouble();

        System.out.println("Employee: " + employee);

        System.out.print("Which percentage to increase salary? ");
        double percentage = input.nextDouble();
        employee.increaseSalary(percentage);

        System.out.println("Updated Data: " + employee);

        input.close();
    }

    public static void studentEx(){
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        Student student = new Student();

        System.out.print("Name's student: ");
        student.name = input.nextLine();

        System.out.println("Enter the grade's values: ");
        student.firstGrade = input.nextDouble();
        student.secondGrade = input.nextDouble();
        student.thirdGrade = input.nextDouble();

        System.out.println(student);

        input.close();
    }
}
