package com.company.poo.files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterBufferedWriter {
    public static void main(String[] args){
        String[] lines = new String[] {"Good morning", "Good afternoon", "Good night"};
        String path = "C:\\Users\\Utilizador\\Desktop\\out.txt";

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){ //If exists put true;
            for(String line : lines){
                bw.write(line);
                bw.newLine();
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
