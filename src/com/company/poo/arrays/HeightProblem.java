package com.company.poo.arrays;

import java.util.Locale;
import java.util.Scanner;

public class HeightProblem {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int numPeople;

        System.out.print("Enter the number os people: ");
        numPeople = input.nextInt();

        double[] people = newArray(numPeople);

        System.out.println("Height Average: " + String.format("%.2f", average(people)));

        input.close();
    }
    public static double [] newArray(int elements){
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        double[] values = new double[elements];

        for(int i = 0; i<values.length; i++){
            System.out.printf("array[%d] = ", i);
            values[i] = input.nextDouble();
        }
        //input.close();
        return values;
    }

    public static double average(double [] array){
        double sum = 0.00;
        int i = 0;

        while(i<array.length){
            sum+= array[i];
            i++;
        }

        return sum/(i+1);
    }
}
