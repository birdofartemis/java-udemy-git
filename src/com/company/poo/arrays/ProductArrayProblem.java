package com.company.poo.arrays;
import com.company.poo.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class ProductArrayProblem {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        Product[] products = new Product[n];
        for(int i = 0; i< products.length; i++){
            input.nextLine();
            String name = input.nextLine();
            double price = input.nextDouble();

            products[i] = new Product(name, price);
        }

        double sum = 0.0;
        for(int i = 0; i< products.length; i++){

            sum+= products[i].getPrice();
        }

        double average = sum/products.length;

        input.close();
    }
}
