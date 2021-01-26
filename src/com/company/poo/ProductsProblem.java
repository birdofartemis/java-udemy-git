package com.company.poo;

import com.company.poo.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class ProductsProblem {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Product Data: ");
        System.out.print("Name: ");
        String name = input.nextLine();
        System.out.print("Price: ");
        double price = input.nextDouble();
        System.out.print("Quantity in stock: ");
        int quantity = input.nextInt();

        Product product = new Product(name, price);//To avoid inconsistency lets add argues to the constructor

        System.out.println("Product data: " + product);

        System.out.print("\nQuantity to be add to product " + product.getName() + ": ");
        quantity = input.nextInt();
        product.addProducts(quantity);
        System.out.println("Updated Data: " + product);

        System.out.print("\nQuantity to be removed from product " + product.getName() + ": ");
        quantity = input.nextInt();
        product.removeProduct(quantity);
        System.out.println("Updated Data: " + product);

        input.close();
    }
}
