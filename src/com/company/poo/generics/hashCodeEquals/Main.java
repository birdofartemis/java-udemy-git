package com.company.poo.generics.hashCodeEquals;

import com.company.poo.generics.hashCodeEquals.entities.Client;

public class Main {
    public static void main(String[] args){

        //We need to generate hashCode and equals method in our classes
        Client c1 = new Client("Maria", "maria@gmail.com");
        Client c2 = new Client("Maria", "maria@gmail.com");

        String s1 = "Test";
        String s2 = "Test";

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2)); //content comparison
        System.out.println(c1 == c2); //memory reference
        System.out.println(s1 == s2); //special treatment to literal expressions

    }
}
