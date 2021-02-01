package com.company.poo;

import com.company.poo.entities.Client;
import com.company.poo.entities.ClientOrder;
import com.company.poo.entities.ClientOrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class ClientOrderProblem {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Client client = createClientRecord();
        ClientOrder clientOrder = createOrderClient(client);

        System.out.println(clientOrder);


    }
    public static Client createClientRecord() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner input = new Scanner(System.in);

        String name;
        String email;
        Date birth;

        System.out.println("Enter client data: ");
        System.out.print("Name: ");
        name = input.nextLine();
        System.out.print("Email: ");
        email = input.nextLine();
        System.out.print("Birth (dd/MM/yyyy): ");
        birth = sdf.parse(input.next());

        return new Client(name, email, birth);
    }

    public static ClientOrder createOrderClient(Client client){
        Scanner input = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        String status, name;
        int quantity, productQuantity;
        double price;

        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        status = input.nextLine();
        System.out.print("How many items to this order? ");
        quantity = input.nextInt();
        input.nextLine();
        ClientOrder order = new ClientOrder(ClientOrderStatus.valueOf(status), client);

        for(int i = 0; i<quantity; i++){
            System.out.println("Enter #" + (i+1) + " item data:");

            System.out.print("Product name: ");
            name = input.nextLine();
            System.out.print("Product Price: ");
            price = input.nextDouble();
            System.out.print("Quantity: ");
            productQuantity = input.nextInt();
            input.nextLine();

            order.addItem(productQuantity, price, name);
        }
        return order;
    }
}
