package com.company.poo.generics.set.ex1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args){
        //add, remove, contains; addAll(Union), retainAll(Interception), removeAll(Subtraction/difference)
        //clear(Cleans set collection), size, removeIf(predicate)

        //Set<String> set = new HashSet<>(); //not ordered
        //Set<String> set = new TreeSet<>(); //ordered by implantation of CompareTo
        Set<String> set = new LinkedHashSet<>(); //Ordered by arrival order

        set.add("TV");
        set.add("Tablet");
        set.add("Notebook");

        set.removeIf(x -> x.length() >=3);
        System.out.println(set.contains("Notebook"));

        for(String p : set){
            System.out.println(p);
        }
    }
}
