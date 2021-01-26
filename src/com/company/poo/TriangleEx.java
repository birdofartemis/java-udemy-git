package com.company.poo;

import java.util.Locale;
import java.util.Scanner;
import com.company.poo.entities.Triangle;

public class TriangleEx {
    public static void main(String[] args){
        triangleIsBigger();

    }
    public static void biggerTriangle() {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        double xA, xB, xC;
        double p, areaX, areaY;

        do{
            System.out.println("Triangle X");
            System.out.print("Value a: ");
            xA = input.nextDouble();
            System.out.print("\nValue b: ");
            xB = input.nextDouble();
            System.out.print("\nValue c: ");
            xC = input.nextDouble();
        }while (!(xA>0.0 && xB>0.0 && xC>0.0));

        p = (xA+xB+xC)/2.0;
        areaX = Math.sqrt(p*(p-xA)*(p-xB)*(p-xC));

        do{
            System.out.println("Triangle Y");
            System.out.print("Value a: ");
            xA = input.nextDouble();
            System.out.print("\nValue b: ");
            xB = input.nextDouble();
            System.out.print("\nValue c: ");
            xC = input.nextDouble();
        }while (!(xA>0 && xB>0 && xC>0));
        p = (xA+xB+xC)/2.0;
        areaY = Math.sqrt(p*(p-xA)*(p-xB)*(p-xC));

        System.out.printf("Triangle X area %.4f%n", areaX);
        System.out.printf("Triangle Y area %.4f%n", areaY);

        if(areaX == areaY){
            System.out.println("They are equal");
        }
        else if(areaX> areaY){
            System.out.println("Triangle X is larger");
        }
        else{
            System.out.println("Triangle Y is larger");
        }

        input.close();
    }

    public static void triangleIsBigger(){
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        do{
            System.out.println("Triangle X:");
            System.out.print("Value a: ");
            x.a = input.nextDouble();
            System.out.print("\nValue b: ");
            x.b = input.nextDouble();
            System.out.print("\nValue c: ");
            x.c = input.nextDouble();
        }while (!(x.a>0 && x.b>0 && x.c>0));

        do{
            System.out.println("\nTriangle Y:");
            System.out.print("Value a: ");
            y.a = input.nextDouble();
            System.out.print("\nValue b: ");
            y.b = input.nextDouble();
            System.out.print("\nValue c: ");
            y.c = input.nextDouble();
        }while (!(x.a>0 && x.b>0 && x.c>0));


        System.out.printf("Triangle X area %.4f%n", x.area());
        System.out.printf("Triangle Y area %.4f%n", y.area());

        if(x.area() == y.area()){
            System.out.println("They are equal");
        }
        else if(x.area()> y.area()){
            System.out.println("Triangle X is larger");
        }
        else{
            System.out.println("Triangle Y is larger");
        }


        input.close();
    }
}
