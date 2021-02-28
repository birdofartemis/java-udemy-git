package com.company.poo.exceptions.problemTwo;

import java.util.Locale;
import java.util.Scanner;

public class GesAccount {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.println("Enter account data");
        try{
            System.out.print("Number: ");
            int numberAccount = input.nextInt();
            System.out.print("Holder: ");
            input.nextLine();
            String name = input.nextLine();
            System.out.print("Initial balance: ");
            double balance = input.nextDouble();
            System.out.print("Withdraw limit: ");
            double withdrawLimit = input.nextDouble();

            Account account = new Account(numberAccount, name, balance, withdrawLimit);

            System.out.print("\nEnter amount for withdraw: ");
            account.withdraw(input.nextDouble());
            System.out.println(account);
        }
        catch (DomainException e){
            System.out.println("Error: " + e.getMessage());
        }
        catch (RuntimeException e){
            System.out.println("Error: Unexpected Error");
        }
        input.close();
    }
}
