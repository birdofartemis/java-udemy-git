package com.company.functionalProgramming.stream.ex2;

import com.company.functionalProgramming.stream.ex2.entities.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.println("Enter full file path: ");
        String path = input.nextLine();   //C:\Users\Utilizador\Desktop\source.csv

        try (input; BufferedReader br = new BufferedReader(new FileReader(path))) {
            List<Product> list = new ArrayList<>();

            String line = br.readLine();
            while (line != null) {
                String[] splitArray = line.split(";");
                list.add(new Product(splitArray[0], Double.parseDouble(splitArray[1])));
                line = br.readLine();
            }

            double averagePrice = list.stream().map(p -> p.getPrice()).reduce(0.0, (x, y) -> x+y) / list.size();

            Comparator<String> comparator = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
            System.out.println("Average Price: " + String.format("%.2f", averagePrice));

            List<String> productNames = list.stream().filter(p -> p.getPrice() < averagePrice).map(p -> p.getName())
                    .sorted(comparator.reversed()).collect(Collectors.toList());

            productNames.forEach(System.out::println);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
