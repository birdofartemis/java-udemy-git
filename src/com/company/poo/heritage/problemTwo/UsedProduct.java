package com.company.poo.heritage.problemTwo;

import java.text.SimpleDateFormat;
import java.util.Date;

public final class UsedProduct extends Product {
    //Attributes
    private Date manufactureDate;
    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    //Constructors
    public UsedProduct() {
    }

    public UsedProduct(String name, Double price, Date manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    //Getters and Setters
    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @Override
    public final String priceTag() {
        return getName() + " (used) $ " + getPrice() + " Manufacture date: " + sdf.format(getManufactureDate());
    }
}
