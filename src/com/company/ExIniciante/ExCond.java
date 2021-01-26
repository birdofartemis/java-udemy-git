package com.company.ExIniciante;

import java.util.Locale;
import java.util.Scanner;

public class ExCond {
    public static void main(String[] args){
        even(91005);
    }
    public static boolean negNum(int num){
        if(num>=0){
            System.out.printf("Non negative number: %d%n", num);
            return false;
        }
        else{
            System.out.printf("Negative number: %d%n", num);
            return true;
        }
    }
    public static boolean even(int num){
        if(num % 2 == 0){
            System.out.println(num + " Is even");
            return true;
        }
        else{
            System.out.println(num + " Is odd");
            return false;
        }
    }
    public static boolean isMultiple(int a, int b){
        if(a % b == 0 || b % a == 0){
            System.out.println("They are multiples!");
            return true;
        }
        else{
            System.out.println("They are not multiples!");
            return false;
        }
    }
    public static void gameHours(byte a, byte b){
        byte hours;
        if(b > a){
            hours = (byte) (b-a);
        }
        else{
            hours = (byte) (24-a+b);
        }
        System.out.println("GAME DURATION: " + hours + " Hour(s)");
    }
    public static void valToPay(){
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        byte id;
        int quantity;

        System.out.println("Insert the Product ID: ");
        id = input.nextByte();
        System.out.println("Insert the Quantity: ");
        quantity = input.nextInt();

        switch (id) {
            case 1 -> System.out.println("Total: U$ " + 4.00 * quantity);
            case 2 -> System.out.println("Total: U$ " + 4.50 * quantity);
            case 3 -> System.out.println("Total: U$ " + 5.00 * quantity);
            case 4 -> System.out.println("Total: U$ " + 2.00 * quantity);
            case 5 -> System.out.println("Total: U$ " + 1.50 * quantity);
            default -> System.out.println("Error...");
        }
        input.close();
    }
    public static void rangNum(float num){
        if(num>= 0 && num <=25){
            System.out.println("Range: [0,25]");
        }
        else if(num <= 50){
            System.out.println("Range: ]25,50]");
        }
        else if(num<=75){
            System.out.println("Range: ]50,75]");
        }
        else if(num <= 100){
            System.out.println("Range: ]75,100]");
        }
        else{
            System.out.println("Out of range...");
        }
    }
    public static void whiQuad(){
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        float x, y ;

        System.out.println("Insert the values of x and y, respectively: ");
        x = input.nextFloat();
        y = input.nextFloat();

        if(x > 0f && y> 0f){
            System.out.println("Q1");
        }
        else if(x<0f && y>0f){
            System.out.println("Q2");
        }
        else if(x<0f && y<0f){
            System.out.println("Q3");
        }
        else if(x>0f && y<0f){
            System.out.println("Q4");
        }
        else if(x==0f && y!=0f){
            System.out.println("Axis x");
        }
        else if(x!=0f && y==0f){
            System.out.println("Axis y");
        }
        else if(x==0f && y==0f){
            System.out.println("Origen");
        }
        input.close();
    }
    public static void calcTax(){
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        double salary, tax;

        System.out.println("Insert the R$ of your salary: ");
        salary = input.nextDouble();

        if(salary<=2000.00){
            tax = 0.00;
        }
        else if(salary<=3000.00){
            tax = (salary-2000.01) * 0.08;
        }
        else if(salary<=4500.00){
            tax = (salary-3000.01) * 0.18 + 1000*0.08;
        }
        else if(salary>4500.00){
            tax = (salary-4500.00) * 0.28 + 1000 * 0.08 + 1500 * 0.18;
        }
        else{
            tax = 0.00;
        }
        System.out.printf("R$ %.2f", tax);
        input.close();
    }
}
