package com.company.poo.files;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileScanner {
    public static void main(String[] args){
        File file = new File("C:\\Users\\Utilizador\\Desktop\\in.txt"); // abstraction of file
        Scanner input = null;
        try{
            input = new Scanner(file); // it opens the file
            while (input.hasNextLine()){ // if there is one more line in the file
                System.out.println(input.nextLine());
            }
        }
        catch (IOException e){
            System.out.println("Error " + e.getMessage());
        }
        finally {
            if(input != null){
                input.close();
            }
        }
    }
}
