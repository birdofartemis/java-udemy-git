package com.company.functionalProgramming.predicate;

import com.company.functionalProgramming.predicate.entities.Product;
import com.company.functionalProgramming.predicate.util.ProductPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args){
        List<Product> list = new ArrayList<>();
        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        Predicate <Product> predicate = x -> x.getPrice() >= 100.00;

        list.removeIf(new ProductPredicate());
        list.removeIf(Product ::staticProductPredicate); //method reference
        list.removeIf(Product ::nonStaticProductPredicate); //method reference
        list.removeIf(predicate); //method declared
        list.removeIf((x -> x.getPrice() >= 100.00)); // Lambda function


        for(Product p : list){
            System.out.println(p);
        }
    }
}
