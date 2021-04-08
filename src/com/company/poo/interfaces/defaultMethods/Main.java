package com.company.poo.interfaces.defaultMethods;

import com.company.poo.interfaces.defaultMethods.services.BrazilInterestService;
import com.company.poo.interfaces.defaultMethods.services.InterestService;
import com.company.poo.interfaces.defaultMethods.services.UsaInterestService;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Amount: ");
        double amount = input.nextDouble();
        System.out.print("Months: ");
        int months = input.nextInt();

        InterestService interestService = new UsaInterestService(2.0);
        double payment = interestService.payment(amount, months);

        System.out.println("Payment after " + months + " months:");
        System.out.println(String.format("%.2f", payment));

        input.close();
    }
}
