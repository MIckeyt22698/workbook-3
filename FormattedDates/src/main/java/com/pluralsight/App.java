package com.pluralsight;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        {
            DateTimeFormatter fmt =
                    DateTimeFormatter.ofPattern("MM/dd/yyyy");
            String formattedDate = today.format(fmt);
            System.out.println("Today is: " + formattedDate);
            LocalDate today2 = LocalDate.now();
            System.out.println("Today is: " + today);
        }
        {
            LocalDateTime today3 = LocalDateTime.now();
            LocalDateTime dateAndTime = LocalDateTime.now();
            DateTimeFormatter fmt =
                    DateTimeFormatter.ofPattern("MMMM d, yyyy");
            String formattedDate = today3.format(fmt);
            System.out.println("Today is: " + formattedDate);
        }
        {
            LocalDateTime today4 = LocalDateTime.now();
            LocalDateTime dateAndTime = LocalDateTime.now();
            DateTimeFormatter fmt =
                    DateTimeFormatter.ofPattern("E, MMM dd, yyyy HH:mm:ss");
            String formattedDate = today4.format(fmt);
            System.out.println("Today is: " + formattedDate);
        }
    }
}