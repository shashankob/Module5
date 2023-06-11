package org.example;

import java.util.Scanner;
public class PartyAffiliation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your Party Affiliation?");
        System.out.println("1 = Democrat, 2 = Republican, 3 = Independent, 4 = Other" );
        double partyChoice = scanner.nextInt();

        String symbolChoice;
        String partyAffiliation;

        if (partyChoice == 1) {
            symbolChoice = "Donkey";
            partyAffiliation = "Democratic";

        } else if (partyChoice == 2) {
            symbolChoice = "Elephant";
            partyAffiliation = "Republican";

        } else if (partyChoice == 3) {
            symbolChoice = "Person";
            partyAffiliation = "Independent";

        } else {
            symbolChoice = "Unknown";
            partyAffiliation = "Other";
        }

        System.out.println("You get a " + partyAffiliation + " " +  symbolChoice + "!");

        scanner.close();
    }
}
