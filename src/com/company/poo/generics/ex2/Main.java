package com.company.poo.generics.ex2;

import com.company.poo.generics.ex2.entities.Product;
import com.company.poo.generics.ex2.services.CalculationsService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        String path = "C:\\Users\\Utilizador\\Desktop\\source.csv";

        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();

            while(line != null){
                String[] split = line.split(";");
                list.add(new Product(split[0], Double.parseDouble(split[1])));

                line = br.readLine();
            }
            Product x = CalculationsService.max(list);
            System.out.println(x);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
