package com.company.poo.files;

import java.io.File;
import java.util.Scanner;

public class FileInformation {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a file path");
        String strPath = input.nextLine();

        File path = new File(strPath);

        System.out.println("GetName: " + path.getName()); //File's name
        System.out.println("GetParent: " + path.getParent()); //File's relative path
        System.out.println("GetPath: " + path.getPath()); //File's all path

        input.close();
    }
}
