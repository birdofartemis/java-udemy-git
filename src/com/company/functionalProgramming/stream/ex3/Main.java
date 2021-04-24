package com.company.functionalProgramming.stream.ex3;

import com.company.functionalProgramming.stream.ex3.entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.println("Enter full file path:");
        String path = input.nextLine();


        try(input; BufferedReader br = new BufferedReader(new FileReader(path))){
            List<Employee> employeesList = new ArrayList<>();

            String line = br.readLine();
            while(line != null){
                String[] fields = line.split(",");
                employeesList.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
                line = br.readLine();
            }

            System.out.print("Enter salary: ");
            double limitSalary = input.nextDouble();

            List<String> employeeAboveLimit = employeesList.stream().filter(e -> e.getSalary()> limitSalary)
                    .map(Employee::getEmail)
                    .sorted(String::compareTo)
                    .collect(Collectors.toList());

            employeeAboveLimit.forEach(System.out::println);

            System.out.println("Sum of salary of people: " +
                    String.format("%.2f", salarySum(employeesList, e -> e.getName().toUpperCase().charAt(0) == 'M')));

        } catch (IOException e) { e.printStackTrace(); }
    }

    public static double salarySum(List<Employee> employees, Predicate<Employee> predicate){
        return employees.stream().filter(predicate).map(Employee::getSalary).reduce(0.0, Double::sum);
    }
}
