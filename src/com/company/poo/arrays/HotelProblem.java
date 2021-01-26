package com.company.poo.arrays;

import com.company.poo.entities.Hotel;

import java.util.Scanner;

public class HotelProblem {
    public static void main(String[] args) {
        int n = 9, numbPeople = 3;
        Hotel[] hotels = new Hotel[n];

        //method input
        rooms(hotels, numbPeople);

        //method output
        printInOrder(hotels);
    }

    public static void rooms(Hotel[] array, int numbPeople) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numbPeople; i++) {
            System.out.print("Room: ");
            int room = scanner.nextInt();

            scanner.nextLine();

            System.out.print("name: ");
            String name = scanner.nextLine();

            System.out.print("email: ");
            String email = scanner.nextLine();

            array[room] = new Hotel(room, name, email);
        }
        scanner.close();
    }

    public static void printInOrder(Hotel[] array) {
        for (Hotel hotel : array) {
            if (hotel != null) {
                System.out.println(hotel);
            }
        }
    }
}