package com.company.poo.arrays;

import java.util.Scanner;

public class MatrixProblem {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int x, y, valueOfMatrix;

        System.out.println("Define the edges (x, y): ");
        x = input.nextInt();
        y = input.nextInt();

        int [][] matrix = createMatrix(x, y);

        System.out.print("Enter a value to know relative positions: ");
        valueOfMatrix = input.nextInt();

        relativePositions(matrix, valueOfMatrix);

        input.close();
    }

    public static int[][] createMatrix(int x, int y){
        Scanner input = new Scanner(System.in);
        int[][] numbers = new int[x][y];

        for(int i = 0; i<x; i++){
            for(int j = 0; j<y; j++){
                System.out.printf("#%d #%d ", i, j);
                numbers[i][j] = input.nextInt();
            }
        }

        return numbers;
    }

    public static void relativePositions(int[][] array, int value){
        for(int i = 0; i<array.length; i++){
            for(int j = 0; j<array[0].length; j++){
                if(value == array[i][j]){
                    System.out.println("Position " + i + ", " + j);

                    if(j>0) {
                        System.out.println("Left: " + array[i][j - 1]);
                    }
                    if(j<array[0].length-1) {
                        System.out.println("Right: " + array[i][j + 1]);
                    }

                    if(i>0) {
                        System.out.println("Up: " + array[i - 1][j]);
                    }
                    if(i<array.length-1) {
                        System.out.println("Down: " + array[i + 1][j]);
                    }
                }
            }
        }
    }
}
