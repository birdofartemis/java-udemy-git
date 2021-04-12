package com.company.poo.generics.set.ex3;

import com.company.poo.generics.set.ex3.entities.Product;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Product> set = new HashSet<>();
        set.add(new Product("TV", 900.0));
        set.add(new Product("Notebook", 1200.0));
        set.add(new Product("Tablet", 400.0));

        Product prod = new Product("Notebook", 1200.0);

        System.out.println(set.contains(prod)); // Reference to pointers prod != Notebook, 1200.0 => False
        //We need to generate equals method and hashcode
        }


}
