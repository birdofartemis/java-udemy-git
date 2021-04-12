package com.company.poo.generics.set.ex5;

import com.company.poo.generics.set.ex5.entities.LogEntry;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Date;
import java.time.Instant;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the file full path: ");
        String path = input.nextLine();

        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            Set<LogEntry> set = new HashSet<>();

           String line = br.readLine();

           while(line != null){
               String[] split = line.split(" ");

               set.add(new LogEntry(split[0], Date.from(Instant.parse(split[1]))));

               line = br.readLine();
           }
           System.out.println("Total users: " + set.size());

        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            input.close();
        }
    }
}
