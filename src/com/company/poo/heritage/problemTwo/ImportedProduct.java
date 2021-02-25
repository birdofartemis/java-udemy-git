package com.company.poo.heritage.problemTwo;

public final class ImportedProduct extends Product{
    //Attributes
    private Double customsFee;

    //Constructors
    public ImportedProduct() {
    }

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    //Getters and Setters
    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    //Functions
    public Double totalPrice(){
        return getPrice() + getCustomsFee();
    }

    @Override
    public final String priceTag() {
        return super.priceTag() + " (Customs fee: $ " + getCustomsFee() + ")";
    }
}
