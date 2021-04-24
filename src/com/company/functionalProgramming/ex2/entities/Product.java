package com.company.functionalProgramming.ex2.entities;

public class Product {
    private String name;
    private Double price;

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public static String staticUpperCaseName(com.company.functionalProgramming.function.entities.Product product){
        return product.getName().toUpperCase();
    }
    public String nonStaticUpperCaseName(){
        return name.toUpperCase();
    }

    @Override
    public String toString(){
        return "Product: " + getName() + ", " + String.format("%.2f", getPrice()) + "€";
    }
}
