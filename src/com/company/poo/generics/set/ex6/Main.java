package com.company.poo.generics.set.ex6;

import com.company.poo.generics.set.ex6.entities.Student;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Set<Student> set = new HashSet<>();
        int id;

        System.out.print("How many Students for course A: ");
        int n = input.nextInt();
        for(int i = 0; i<n; i++){
            id = input.nextInt();
            set.add(new Student(id, "A"));
        }

        System.out.print("How many Students for course B: ");
        n = input.nextInt();
        for(int i = 0; i<n; i++){
            id = input.nextInt();
            set.add(new Student(id, "B"));
        }

        System.out.print("How many Students for course C: ");
        n = input.nextInt();
        for(int i = 0; i<n; i++){
            id = input.nextInt();
            set.add(new Student(id, "C"));
        }

        System.out.println("Total students: " + set.size());

        input.close();
    }
}
