package com.company.poo.entities;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(){
    }

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product(String name, double price){
        this.name = name;
        this.price = price;
        //quantity = 0; //Int with no value is equal to zero so this can be deleted and we do not need to use this. here;
    }

    public double totalValueInStock(){
        return quantity*price;
    }

    public void addProducts(int quantity){
        this.quantity += quantity;
    }

    public void removeProduct(int quantity){
        this.quantity -= quantity;
    }

    public String toString(){
        return name +
                " , Quantity: " + quantity +
                " , Unit: $ " + String.format("%.2f", price) +
                " , Total: $ "+ String.format("%.2f", totalValueInStock());
    }

    public String getName() {
        return name;
    }
    public double getPrice(){
        return price;
    }
    public int getQuantity(){
        return quantity;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setPrice(){
        this.price = price;
    }
}
