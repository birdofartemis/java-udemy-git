package com.company.poo.files.FileEx;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        List<Product> productList = new ArrayList();

        Scanner output = new Scanner(System.in);

        System.out.println("Enter the path file: ");
        String strPath = output.nextLine();
        File file = new File(strPath);

        boolean success = new File(file.getParent() + "\\out").mkdir();
        System.out.println("Created directory with: " + success);

        try(BufferedReader br = new BufferedReader(new FileReader(file))){
            String line = br.readLine();
            while(line != null){
                String[] splitValues = line.split(";");

                String name = splitValues[0];
                double price = Double.parseDouble(splitValues[1]);
                int quantity = Integer.parseInt(splitValues[2]);

                productList.add(new Product(name, price, quantity));

                line = br.readLine();
            }

            strPath = file.getParent() + "\\out\\summary.csv";

            try(BufferedWriter bw = new BufferedWriter(new FileWriter(strPath))){
                for(Product product : productList){
                    bw.write(product.getName() + ";" + String.format("%.2f", product.total()));
                    bw.newLine();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        finally {
            output.close();
        }
    }
}
