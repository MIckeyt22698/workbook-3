package com.pluralsight;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {


        String stories = ("\"Goldilocks\", \"Hansel and Gretel\", \"Mary had a little lamb\"");
        System.out.println("Which story would you like?" + stories);

        Scanner scanner = new Scanner(System.in);
        String storyName = scanner.nextLine();
        
        try {

            FileInputStream fis = new FileInputStream("DataFiles/" + storyName + ".txt");
            Scanner keyStrokes = new Scanner(fis);
            String storyChoice;


            while (keyStrokes.hasNextLine()) {
                storyChoice = keyStrokes.nextLine();
                System.out.println(storyChoice);
            }

            keyStrokes.close();
        } catch (IOException e) {
            System.out.println("No Such File Exists");
            System.out.println(e);
        }


    }
}