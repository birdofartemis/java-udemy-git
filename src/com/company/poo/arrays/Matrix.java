package com.company.poo.arrays;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int count = 0;

        int n = input.nextInt();

        int[][] matrix = new int[n][n];

        for(int i = 0; i<matrix[i].length; i++){
            for(int j = 0; j<matrix[i].length; j++){
                System.out.printf("#%d #%d\n ", i, j);
                matrix[i][j] = input.nextInt();
            }
        }
        System.out.println("Main Diagonal: ");
        for(int i = 0; i<matrix[i].length; i++){
            System.out.print(matrix[i][i] + " ");
        }
        //negative numbers
        for(int i = 0; i<matrix[i].length; i++){
            for(int j = 0; j<matrix[i].length; j++){
                if(matrix[i][j] < 0){
                    count++;
                }
            }
        }
        System.out.println("Number of negative numbers: " + count);

        input.close();
    }
}
