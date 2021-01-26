package com.company.ExIniciante;
import java.lang.Math;
import java.util.Locale;
import java.util.Scanner;
public class Ex {

    public static void main(String[] args){
        figArea();
    }

    public static void sum(){
        double a;
        Scanner input = new Scanner(System.in);

        System.out.println("Put 2 numbers to sum: ");
        a = input.nextDouble() + input.nextDouble();
        input.close();

        System.out.println("The sum is equal to: " + a);
    }

    public static void piArea(){
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        double radius, area;

        System.out.println("Put the value of the radius: ");
        radius = input.nextDouble();
        input.close();
        area = Math.PI * Math.pow(radius, 2);

        System.out.printf("The value of the circle area is: %.4f", area);

    }
    public static void prodDif(){
        int A, B, C ,D;
        int Difference;
        Scanner input = new Scanner(System.in);

        System.out.println("Choose the value of A, B, C and D, respectively: ");
        A= input.nextInt();
        B= input.nextInt();
        C= input.nextInt();
        D= input.nextInt();
        input.close();

        Difference = A*B - C*D;
        System.out.println("Difference = " + Difference);
    }

    public static void salary(){
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        byte code;
        short hours;
        float salary, _$perHour;

        System.out.println("Insert your code: ");
        code = input.nextByte();
        System.out.println("Insert the number of working hours: ");
        hours = input.nextShort();
        System.out.println("Insert the hourly payment: ");
        _$perHour = input.nextFloat();
        input.close();

        salary = hours * _$perHour;

        System.out.println("NUMBER: " + code);
        System.out.printf("Salary = U$ %.2f%n", salary);
    }
    public static void valueToPay(){
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        byte code1, code2, num1, num2;
        float _$uniVal1, _$uniVal2, _$totVal;

        System.out.println(
                "Insert, respectively, the code, quantity and unit value of the first article: ");
        code1 = input.nextByte();
        num1 = input.nextByte();
        _$uniVal1 = input.nextFloat();

        System.out.println(
                "Insert, respectively, the code, quantity and unit value of the second article: ");
        code2 = input.nextByte();
        num2 = input.nextByte();
        _$uniVal2 = input.nextFloat();
        input.close();

        _$totVal = num1*_$uniVal1 + num2 * _$uniVal2;
        System.out.printf("Pay Value : U$ %.2f%n", _$totVal);
    }

    public static void figArea(){
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        float A, B, C;
        double area;

        System.out.println("Insert, respectively, the values of A, B and C: " );
        A= input.nextFloat();
        B= input.nextFloat();
        C= input.nextFloat();
        input.close();

        area = A*C/2; //Triangle Area
        System.out.printf("TRIANGLE: %.3f%n", area);

        area = Math.PI * Math.pow(C, 2);
        System.out.printf("CIRCLE: %.3f%n", area);

        area = (A + B)*C/2;
        System.out.printf("TRAPEZE: %.3f%n", area);

        area = Math.pow(B, 2);
        System.out.printf("SQUARE: %.3f%n", area);

        area = A*B;
        System.out.printf("RECTANGLE: %.3f%n", area);
    }
}