package com.pluralsight;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        String[] quotes = {
                "\"Carpe diem.\" — Horace",
                "\"Less is more.\" — Mies van der Rohe",
                "\"Yes, we can!\" — Barack Obama",
                "\"Character is power.\" — Booker T. Washington",
                "\"No day but today.\" — Jonathan Larson",
                "\"The best way out is always through.\" — Robert Frost",
                "\"Oh, the places you’ll go!” — Dr. Seuss",
                "\"Be yourself; everyone else is already taken.\" — Oscar Wilde",
                "\"I think, therefore I am.\" — René Descartes",
                "\"Think different.\"  — Apple"
        };
        Scanner keyStrokes = new Scanner(System.in);
        String yesOrNo = "y";

        while (yesOrNo.equalsIgnoreCase("y")) {
            System.out.println("Choose a number between 1 and 10 for a quote!");

            try {
                int quoteNumber = keyStrokes.nextInt();
                keyStrokes.nextLine();
                System.out.println(quotes[quoteNumber - 1]);

            } catch (Exception e) {
                System.out.println("Your number was out of range!");
            }


            System.out.println("Would you like another quote? (y/n)");
            yesOrNo = keyStrokes.nextLine().trim();


            if (yesOrNo.equalsIgnoreCase("n")) {

                System.out.println("Thank you for using the quote generator!");
                break;

            }


        }
    }
}

