package com.company.poo.generics.ex2.services;

import java.util.List;

public class CalculationsService {
    public static <Type extends Comparable< ? super Type>> Type max(List<Type> list){ //Any superClass of Object (Product)
        if(list.isEmpty()){
            throw new IllegalStateException("List cannot be empty");
        }
        Type max = list.get(0);
        for(Type object : list){
            if(object.compareTo(max) > 0){
                max = object;
            }
        }
        return max;
    }
}
