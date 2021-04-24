package com.company.functionalProgramming.ex2;

import com.company.functionalProgramming.ex2.entities.Product;
import com.company.functionalProgramming.ex2.model.services.ProductService;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        Function<Product, String> function = x -> x.getName().toUpperCase();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        ProductService ps = new ProductService();

        double sum = ps.filteredSum(list, p -> p.getName().charAt(0) == 'T');
        sum = ps.filteredSum(list, p -> p.getPrice()>=100); //FLEXIBILITY!!!!!

        System.out.println(sum);

        //or


    }
}
