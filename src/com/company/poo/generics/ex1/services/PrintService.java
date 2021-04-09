package com.company.poo.generics.ex1.services;

import java.util.ArrayList;
import java.util.List;

public class PrintService<Type> {
   private List<Type> listNumbers = new ArrayList();

    public List<Type> getListNumbers() {
        return listNumbers;
    }

    public void addValue(Type value) {
        getListNumbers().add(value);
    }

    public Type first(){
        if(listNumbers.isEmpty()){
            throw new IllegalStateException("List is empty");
        }
       return getListNumbers().get(0);
    }

    public void print(){
        for(Type n : listNumbers){
            System.out.println(n);
        }
    }
}
