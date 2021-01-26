package com.company.ExIniciante;
import java.util.Scanner;
import java.util.Locale;

public class ExFor {
    public static void main(String[] args) {
        squCub_N();
    }

    public static void oddUntNum() {
        Scanner input = new Scanner(System.in);
        int X;
        System.out.println("Enter a value X: 1<=X<=1000");
        X = input.nextInt();

        while (X < 1 || X > 1000) {
            System.out.println("Error, try again...");
            X = input.nextInt();
        }
        for(int i = 1; i<=X; i++){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
        input.close();
    }
    public static void numInt_InOut_10to20(){
        Scanner input = new Scanner(System.in);
        int x, in = 0, out = 0;

        System.out.println("Enter the number of numbers to choose: ");
        x = input.nextInt();
        for(int i = x; i>0; i--){
            System.out.println("Times: " + i);
            System.out.println("Enter your number: ");
            int num = input.nextInt();

            if(num>=10 && num <=20){
                in+= 1;
            }
            else{
                out+= 1;
            }
        }
        System.out.println("In: " + in);
        System.out.println("Out: " + out);

        input.close();
    }
    public static void gradAver(){
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        byte n;

        System.out.println("Enter number of cases: ");
        n = input.nextByte();

        for(int i = 0; i<n; i++){
            System.out.println("Insert the value of which case: ");
            float case_1 = input.nextFloat();
            float case_2 = input.nextFloat();
            float case_3 = input.nextFloat();

            float average = (case_1*2f + case_2*3f +case_3*5f)/10.0f;
            System.out.printf("The average is: %.1f%n", average);
        }
        input.close();
    }
    public static void divTimes(){
        Scanner input = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        byte N;

        System.out.println("Enter the number os times, to repeat the process: ");
        N = input.nextByte();
        for(int i = 0; i<N; i++){
            System.out.println("Enter the value of the numerator and denominator, respectively: ");
            short num1 = input.nextShort();
            short num2 = input.nextShort();

            if(num2 == 0){
                System.out.println("Impossible...");
            }
            else{
                float div = (float) num1/num2;
                System.out.printf("Result: %.2f%n", div);
            }
        }
        input.close();
    }
    public static void mathFact(){
        Scanner input = new Scanner(System.in);
        int N, fact = 1;

        System.out.println("Enter the value N: ");
        N = input.nextInt();

        if(N == 0){
            System.out.println("Result: 1");
        }
        else{
            for(int i = N; i>0; i--){
                fact *= i;
            }
            System.out.println("Result: " + fact);
        }
        input.close();
    }
    public static void numDividers(){
        Scanner input = new Scanner(System.in);
        int num;

        System.out.println("Enter the value: ");
        num = input.nextInt();

        System.out.println("Dividers:");
        for(int i=1; i<=num; i++){
            if(num % i == 0){
                System.out.println(i);
            }
        }
        input.close();
    }
    public static void squCub_N(){
        Scanner input = new Scanner(System.in);
        int N;

        System.out.println("Enter the N range: ");
        N = input.nextInt();

        while(N < 1){
            System.out.println("Error... try again: ");
            N = input.nextInt();
        }

        for(int i =1; i<=N; i++){
            System.out.println(i + " " + i*i + " " + i*i*i );
        }
        input.close();
    }
}
