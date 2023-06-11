package org.example;

import java.util.Scanner;

public class TheaterKiosk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your age?: ");
        int agePerson = scanner.nextInt();

        if (agePerson >= 21) {
            System.out.println("You get a wristband!");
        }
        scanner.close();
    }
}



