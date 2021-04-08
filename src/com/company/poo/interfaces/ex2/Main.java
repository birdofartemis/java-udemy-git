package com.company.poo.interfaces.ex2;

import com.company.poo.interfaces.ex2.models.entities.Contract;
import com.company.poo.interfaces.ex2.models.entities.Installment;
import com.company.poo.interfaces.ex2.models.services.ContractService;
import com.company.poo.interfaces.ex2.models.services.PaypalService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        SimpleDateFormat sfd = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter contract data");

        System.out.print("Number: ");
        int number = input.nextInt();
        input.nextLine();
        System.out.print("Date (dd/MM/yyyy): ");
        Date contractDate = sfd.parse(input.nextLine());
        System.out.print("Contract value: ");
        double contractAmount = input.nextDouble();

        Contract contract = new Contract(number, contractDate, contractAmount);

        System.out.print("Enter the number of installments: ");
        int installments = input.nextInt();

        ContractService contractService = new ContractService(new PaypalService());
        contractService.processContract(contract, installments);

        for(Installment installment : contract.getInstallments()){
            System.out.println(installment);
        }

        input.close();
    }
}
