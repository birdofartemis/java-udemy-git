package com.company.functionalProgramming.function.util;

import com.company.functionalProgramming.function.entities.Product;

import java.util.function.Function;

public class UpperCaseName implements Function <Product, String > {
    @Override
    public String apply(Product product) {
        return product.getName().toUpperCase();
    }
}
