package com.company.functionalProgramming.consumer.util;

import com.company.functionalProgramming.consumer.entities.Product;

import java.util.function.Consumer;

public class ProductConsumer implements Consumer<Product> {
    @Override
    public void accept(Product product) {
        product.setPrice(product.getPrice() * 1.1);

    }
}
