package com.company.poo.heritage.problemThree;

import java.util.*;

public class GesPerson {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        List<Person> taxPlayersList = new ArrayList();
        char typeTaxPlayer;

        System.out.print("Enter the number of tax players: ");
        int numTaxPlayers = input.nextInt();

        for(int i = 0; i<numTaxPlayers; i++) {
            System.out.println("\nTax Player #" + (i + 1) + " data:");
            do {
                System.out.print("Individual or Company (i/c)? ");
                typeTaxPlayer = input.next().toLowerCase().charAt(0);

            } while (typeTaxPlayer != 'i' && typeTaxPlayer != 'c');

            createRecord(taxPlayersList, typeTaxPlayer);
        }
        printList(taxPlayersList);
        input.close();
    }

    public static void createRecord(List<Person> list, char typeTaxPlayer) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Name: ");
            String name = input.nextLine();
            System.out.print("Annual income: ");
            double annualIncome = input.nextDouble();

            if (typeTaxPlayer == 'i') {
                System.out.print("Health expenditure: ");
                double healthExpenditure = input.nextDouble();
                Person person = new IndividualPerson(name, annualIncome, healthExpenditure);
                list.add(person);
            } else {
                System.out.print("Number of Employees: ");
                int numberEmployees = input.nextInt();
                Person person = new CollectivePerson(name, annualIncome, numberEmployees);
                list.add(person);
            }
        }
        catch (InputMismatchException error){
            System.out.println("Error...");
            createRecord(list, typeTaxPlayer);
        }
    }

    public static double totalTax(List<Person> list){
        double sum = 0;
        for(Person person : list){
            sum+= person.tax();
        }
        return  sum;
    }

    public static void printList(List<Person> list){
        System.out.println("\nTAXES PAID:");
        for(Person person : list){
            System.out.println(person);
        }
        System.out.println("\nTOTAL TAXES: $ " + String.format("%.2f", totalTax(list)));
    }
}
