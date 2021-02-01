package com.company.poo.entities;

public class OrderItem {
    private ProductItem product;

    private Integer quantity;

    public OrderItem(Integer quantity, ProductItem product) {
        this.quantity = quantity;
        this.product = product;
    }

    public ProductItem getProduct() {
        return product;
    }

    public void setProduct(ProductItem product) {
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }


    public void addQuantity(int n){
        quantity += n;
    }
    public void removeQuantity(int n){
        quantity -= n;
    }
    public double subTotal(){
        return quantity* product.getUnitPrice();
    }

    @Override
    public String toString(){
        return product.getName() + ", $ " + String.format("%.2f", product.getUnitPrice()) +
                ", Quantity: " + getQuantity()
                + ", Subtotal: $ " + String.format("%.2f", subTotal());
    }
}
