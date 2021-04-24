package com.company.functionalProgramming.ex1;

import com.company.functionalProgramming.ex1.entities.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List <Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));

        //list.sort(new MyComparator());


        list.sort((p1 , p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
        //anonymous function arrow function

        for(Product p : list){
            System.out.println(p);
        }

    }
}
