package com.company.functionalProgramming.consumer;

import com.company.functionalProgramming.consumer.entities.Product;
import com.company.functionalProgramming.consumer.util.ProductConsumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        Consumer<Product> consumer = product -> {
            product.setPrice(product.getPrice() * 1.1); //optional key brackets
        };

        list.forEach(new ProductConsumer());
        list.forEach(Product::staticProductConsumer);
        list.forEach(Product::nonStaticProductConsumer);
        list.forEach(consumer);
        list.forEach(product -> {
            product.setPrice(product.getPrice() * 1.1);
        });

        list.forEach(System.out::println);
    }
}
