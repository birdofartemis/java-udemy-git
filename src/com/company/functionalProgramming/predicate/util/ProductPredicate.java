package com.company.functionalProgramming.predicate.util;

import com.company.functionalProgramming.predicate.entities.Product;

import java.util.function.Predicate;

public class ProductPredicate implements Predicate <Product> {


    @Override
    public boolean test(Product product) {
        return product.getPrice() >=100.0;
    }
}
