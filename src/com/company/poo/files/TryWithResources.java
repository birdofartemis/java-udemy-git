package com.company.poo.files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {
    public static void main(String[] args){
        String path = "C:\\Users\\Utilizador\\Desktop\\in.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine(); //If there is no line to read, it returns null

            while (line != null){
                System.out.println(line);
                line = br.readLine();

            }
        }
        catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
