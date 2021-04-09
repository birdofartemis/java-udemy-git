package com.company.poo.generics.ex1;

import com.company.poo.generics.ex1.services.PrintService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        PrintService <Integer> psI = new PrintService<>(); //Using generics
        PrintService <String> psS = new PrintService<>();

        System.out.print("How many values: ");
        int n = input.nextInt();

        for(int i = 0; i<n; i++){
            Integer value = input.nextInt();
            psI.addValue(value);
        }

        psI.print();
        System.out.println("First: " + psI.first());

        input.close();
    }
}
