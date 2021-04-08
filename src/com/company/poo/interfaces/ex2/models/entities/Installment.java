package com.company.poo.interfaces.ex2.models.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Installment {
    private Date dueDate;
    private Double amountPerMonth;

    SimpleDateFormat sfd = new SimpleDateFormat("dd/MM/yyyy");

    public Installment(Date dueDate, Double amountPerMonth) {
        this.dueDate = dueDate;
        this.amountPerMonth = amountPerMonth;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Double getAmountPerMonth() {
        return amountPerMonth;
    }

    public void setAmountPerMonth(Double amountPerMonth) {
        this.amountPerMonth = amountPerMonth;
    }

    @Override
    public String toString(){
        return sfd.format(getDueDate()) + " - " + String.format("%.2f", getAmountPerMonth()) + "€";
    }
}
