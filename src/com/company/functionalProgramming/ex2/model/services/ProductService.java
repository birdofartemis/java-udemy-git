package com.company.functionalProgramming.ex2.model.services;

import com.company.functionalProgramming.ex2.entities.Product;

import java.util.List;
import java.util.function.Predicate;

public class ProductService {
    public double filteredSum(List<Product> list, Predicate<Product> criteria){
        double sum = 0.0;
        for(Product product : list){
            if(criteria.test(product)){
                sum += product.getPrice();
            }
        }
        return sum;
    }
}
