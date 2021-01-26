package com.company.ExIniciante;

import java.util.Arrays;

public class BitEx {

    public static void main(String[] args){
        System.out.println(isEven(9982));
    }

    public static boolean isEven(int num){
        return ((num & 1) !=1);
    }

    public static int aloneValue(int[] array) {
        Arrays.sort(array);

        return 0;
    }
}
