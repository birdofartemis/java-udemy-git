package com.company.poo.interfaces;

import com.company.poo.interfaces.initialExercice.model.entities.CarRental;
import com.company.poo.interfaces.initialExercice.model.entities.Vehicle;
import com.company.poo.interfaces.initialExercice.model.services.BrazilTaxService;
import com.company.poo.interfaces.initialExercice.model.services.RentalService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:ss");

        System.out.println("Enter rental data");
        System.out.print("Car model: ");
        String carModel = input.nextLine();
        System.out.print("Pickup (dd/MM/yyyy HH:ss): ");
        Date start = sdf.parse(input.nextLine());
        System.out.print("Return (dd/MM/yyyy HH:ss): ");
        Date finish = sdf.parse(input.nextLine());
        System.out.print("Enter price per hour: ");

        CarRental cr = new CarRental(start, finish, new Vehicle(carModel));

        double pricePerHour = input.nextDouble();
        System.out.print("Enter price per day: ");
        double pricePerDay = input.nextDouble();

        RentalService rentalService =
                new RentalService(pricePerDay, pricePerHour, new BrazilTaxService());

        rentalService.processInvoice(cr);
        System.out.println("INVOICE");
        System.out.println("Basic Payment: " + String.format("%.2f", cr.getInvoice().getBasicPayment()));
        System.out.println("TAX: " + String.format("%.2f", cr.getInvoice().getTax()));
        System.out.println("Total Payment: " + String.format("%.2f", cr.getInvoice().getTotalPayment()));

        input.close();
    }
}
