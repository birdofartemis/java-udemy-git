package com.company.poo.generics.set.ex4;


import com.company.poo.generics.set.ex4.entities.Product;


import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<com.company.poo.generics.set.ex4.entities.Product> set = new TreeSet<>();
        set.add(new Product("TV", 900.0));
        set.add(new Product("Notebook", 1200.0));
        set.add(new Product("Tablet", 400.0));

        Product prod = new Product("Notebook", 1200.0);

        for(Product p : set){
            System.out.println(p);
        }
    }
}
