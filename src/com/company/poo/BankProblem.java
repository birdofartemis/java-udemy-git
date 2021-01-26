package com.company.poo;

import com.company.poo.entities.BankAccount;
import java.util.Locale;
import java.util.Scanner;

public class BankProblem {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

         int accountNumber;
         String holder;
         double balance = 0.00;
         double deposit;

        System.out.print("Enter account number: ");
        accountNumber = input.nextInt();
        input.nextLine();
        System.out.print("Enter account holder: ");
        holder = input.nextLine();

        if(isDeposit()){
            System.out.print("Enter a initial value: ");
            balance = input.nextDouble();
        }
        BankAccount bankAccount = new BankAccount(accountNumber, holder, balance);

        System.out.println("\nAccount data:\n" + bankAccount + "\n");

        System.out.print("Enter a deposit value: ");
        deposit = input.nextDouble();
        bankAccount.depositValue(deposit);

        System.out.println("\nUpdated account data:\n" + bankAccount + "\n");

        System.out.print("Enter a withdraw value: ");
        deposit = input.nextDouble();
        bankAccount.withdrawValue(deposit);

        System.out.println("\nUpdated account data:\n" + bankAccount + "\n");

        input.close();
    }

    public static boolean isDeposit(){
        Scanner scanner = new Scanner(System.in);
        char initialDeposit;

        do{
            System.out.print("Is there an initial deposit (y/n)?: ");
            initialDeposit = scanner.next().charAt(0);
            initialDeposit = Character.toLowerCase(initialDeposit);

            if(initialDeposit != 'y' && initialDeposit != 'n'){
                System.out.println("\nError... try again:");
            }
        }   while(initialDeposit != 'y' && initialDeposit != 'n');

        //scanner.close();
        return (initialDeposit == 'y');
    }
}
