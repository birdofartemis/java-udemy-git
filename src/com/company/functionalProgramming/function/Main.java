package com.company.functionalProgramming.function;

import com.company.functionalProgramming.function.entities.Product;
import com.company.functionalProgramming.function.util.UpperCaseName;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        Function<Product, String> function = x -> x.getName().toUpperCase();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));
        list.add(new Product("HD Case", 80.90));

       List <String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
       List <String> names2 = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());
       List <String> names5 = list.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList());
       List <String> names3 = list.stream().map(function).collect(Collectors.toList());
       List <String> names4 = list.stream().map(x -> x.getName().toUpperCase()).collect(Collectors.toList());

       names.forEach(System.out::println);
    }
}
