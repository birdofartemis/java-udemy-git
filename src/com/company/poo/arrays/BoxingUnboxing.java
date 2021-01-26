package com.company.poo.arrays;

public class BoxingUnboxing {
    public static void main(String[] args){
        int x = 20;
        Object object = x; //Boxing (Put int value in object)
        System.out.println(object);
        int y = (int) object; //Unboxing int value from object
        System.out.println(y);

        //Wrapper classes used to natural boxing and unboxing
        /*
        Byte; Short; Integer; Long; Float; Double; Boolean; Character.
        */

        int k = 20;

        Integer obj = k;

        int w = obj*2;
    }
}
