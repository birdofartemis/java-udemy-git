package com.company.poo.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListArray {
    public static void main(String[] args){
        List<String> names = new ArrayList<>();

        names.add("Marco");
        names.add("Marco");
        names.add("Filipe");
        names.add("Alonso");
        names.add("Medeiros");
        names.add(2, "Afonso");
        names.remove("Marco");


        System.out.println(names.size());

        for(String obj : names){
            System.out.println(obj);
        }

        System.out.println("--------------");

        /*names.removeIf(x -> !(x.charAt(0) == 'M'));// Predicate or lambda(True or False) function that removes all occurrences

        for(String obj: names){
            System.out.println(obj);
        }
        */

        System.out.println("Index of Alonso: " + names.indexOf("Alonso"));
        System.out.println("Index of Marco: " + names.indexOf("Marco"));

        //filter list

        List<String> result = names.stream().filter(x -> x.charAt(0) == 'M').collect(Collectors.toList());

        for(String obj: result){
            System.out.println(obj);
        }
        String name = names.stream().filter(x -> x.charAt(0) == 'M').findAny().orElse(null);
        System.out.println(name);
    }
}
