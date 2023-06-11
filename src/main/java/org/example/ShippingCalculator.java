package org.example;

import java.util.Scanner;
public class ShippingCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the price of item $");
        double priceItem = scanner.nextDouble();

        double shippingCost;
        if (priceItem >= 100) {
            shippingCost = 0;
        } else {
            shippingCost = 0.02 * priceItem;
        }

        double totalPrice = priceItem + shippingCost;

        System.out.println("Your shipping cost is $" + shippingCost + " and your totalPrice is $" + totalPrice);

        scanner.close();
    }
}