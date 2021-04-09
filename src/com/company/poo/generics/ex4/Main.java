package com.company.poo.generics.ex4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Integer> myInts = Arrays.asList(1,2,3,4,5);
        List<Double> myDoubles = Arrays.asList(1.4, 2.3);
        List<Object> myObjects = new ArrayList<>();

        copy(myInts, myObjects);
        printList(myObjects);
        copy(myDoubles, myObjects);
        printList(myObjects);
    }

    public static void copy(List<? extends  Number> source, List<? super Number> destiny){ //
        for(Number number : source){
            destiny.add(number);
        }
        //destiny.addAll(source);
    }

    public static void printList(List<?> items){
        for(Object obj : items){
            System.out.print(obj + " ");
        }
        System.out.println();
    }
}
