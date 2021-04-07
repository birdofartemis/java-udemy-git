package com.company.poo.files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderBufferedReader {
    public static void main(String[] args){
        String path = "C:\\Users\\Utilizador\\Desktop\\in.txt";

        FileReader fr = null;
        BufferedReader br = null;

        try{
            fr = new FileReader(path);
            br = new BufferedReader(fr);

            String line = br.readLine(); //If there is no line to read, it returns null

            while (line != null){
                System.out.println(line);
                line = br.readLine();

            }
        }
        catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            try { // Can happen an exception during the close of br and fr
                if (br != null) {
                    br.close();
                }
                if (fr != null) {
                    fr.close();
                }
            }
            catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
