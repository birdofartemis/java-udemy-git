package com.company.poo.interfaces.interfacesComparable;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args){
        String name;
        double salary;
        List<Functionary> list = new ArrayList();
        String path = "C:\\Users\\Utilizador\\Desktop\\source.csv";

        try(BufferedReader br = new BufferedReader(new FileReader(path))){

            String line = br.readLine();
            while(line != null){
                String[] split = line.split(";");

                name = split[0];
                salary = Double.parseDouble(split[1]);

                list.add(new Functionary(name, salary));

                line = br.readLine();
            }

            Collections.sort(list);
            for(Functionary functionary : list){
                System.out.println(functionary);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
