package com.company.poo.heritage.problemTwo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class GesProduct {
    public static void main(String[] args) throws ParseException {
        Scanner input = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        List<Product> productList= new ArrayList();
        char productState;

        System.out.print("Enter the number os products: ");
        byte numberProducts = input.nextByte();

        for(byte i = 0; i<numberProducts; i++){
            System.out.println("\nProduct #" + (i+1) + " data:");
            do {
                System.out.print("Common, used or imported (c/u/i)? ");
                productState = input.next().toLowerCase().charAt(0);
            }while (!isState(productState));

            if(productState == 'c'){
                createCommonProduct(productList);
            }
            else if(productState == 'u'){
                createUsedProduct(productList);
            }
            else{
                createImportedProduct(productList);
            }
        }
        printList(productList);
        input.close();
    }

    public static boolean isState(char state){
        char[] possibleStates = {'c', 'u', 'i'};

        for(char value : possibleStates){
            if(state == value){
                return true;
            }
        }
        return false;
    }

    public static void createCommonProduct(List<Product> list){
        Scanner input = new Scanner(System.in);

        System.out.print("Name: ");
        String name = input.nextLine();
        System.out.print("Price: ");
        double price = input.nextDouble();

        Product product = new Product(name,price);
        list.add(product);
    }
    public static void createImportedProduct(List<Product> list){
        Scanner input = new Scanner(System.in);

        System.out.print("Name: ");
        String name = input.nextLine();
        System.out.print("Price: ");
        double price = input.nextDouble();
        System.out.print("Customs fee: ");
        double customsFee = input.nextDouble();

        Product product = new ImportedProduct(name,price, customsFee);
        list.add(product);
    }

    public static void createUsedProduct(List<Product> list) throws ParseException {
        Scanner input = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Name: ");
        String name = input.nextLine();
        System.out.print("Price: ");
        double price = input.nextDouble();
        System.out.print("Manufacture date (DD/MM/YYYY): ");
        Date date = sdf.parse(input.next());

        Product product = new UsedProduct(name,price, date);
        list.add(product);
    }

    public static void printList(List<Product> list){
        System.out.println("Price Tags");
        for(Product product : list){
            System.out.println(product.priceTag());
        }
    }

}
