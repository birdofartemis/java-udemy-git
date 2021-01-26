package com.company.ExIniciante;

import java.util.Locale;
import java.util.Scanner;

public class ExWhi {
    public static void main(String[] args){
        bestFuel();
    }
    public static void passWord(){
        String pass;
        Scanner input = new Scanner(System.in);

        System.out.println("Insert your Password: ");
        pass = input.nextLine();

        while(!(pass.equals("2002"))){
            System.out.println("Wrong Password, try again: ");
            pass = input.nextLine();
        }
        System.out.println("Access concede... Welcome!");
        input.close();
    }
    public static void wheQuad(){
        Scanner input = new Scanner(System.in);
        int x=1, y=1;

        System.out.println("Insert the value of x and y, respectively, while different from 0: ");
        while(x != 0 && y != 0){
            x = input.nextInt();
            y = input.nextInt();

            if(x > 0 && y> 0){
                System.out.println("Q1");
            }
            else if(x<0 && y>0){
                System.out.println("Q2");
            }
            else if(x<0 && y<0){
                System.out.println("Q3");
            }
            else if(x>0 && y<0){
                System.out.println("Q4");
            }
        }
        System.out.println("Out of bounds... Program end...");
    }
    public static void bestFuel(){
        byte choose = 0, _nAlcohol = 0, _nFuel = 0, _nDiesel = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("BEST FUEL! : \n 1 - Alcohol\n 2 - Fuel\n 3 - Diesel\n 4 - End Program...\n");

        System.out.println("Enter your choose: ");
        while(choose != 4) {
            choose = input.nextByte();
            switch (choose) {
                case 1 -> _nAlcohol += 1;
                case 2 -> _nFuel += 1;
                case 3 -> _nDiesel += 1;
                case 4 -> System.out.println("THANKS!");
                default -> System.out.println("Invalid number, try again...");
            }
        }
        System.out.println("Alcohol: " + _nAlcohol);
        System.out.println("Fuel: " + _nFuel);
        System.out.println("Diesel: " + _nDiesel);

        input.close();
    }
}
