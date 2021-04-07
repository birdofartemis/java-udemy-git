package com.company.poo.files;

import java.io.File;
import java.util.Scanner;

public class FilePaste {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a folder path: ");
        String srtPath = input.nextLine();

        File path = new File(srtPath);

        File[] folders = path.listFiles(File :: isDirectory);
        System.out.println("FOLDERS");
        assert folders != null;

        for(File folder : folders){
            System.out.println(folder);
        }

        File[] files = path.listFiles(File :: isFile);
        System.out.println("FILES");
        assert files != null;

        for(File file : files){
            System.out.println(file);
        }

        boolean success = new File(srtPath + "\\subdir").mkdir();
        System.out.println("Directory created with Success: " + success);
        input.close();
    }
}
