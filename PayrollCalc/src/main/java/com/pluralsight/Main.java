package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        try {


            FileReader fileReader = new FileReader("DataFiles/employees.csv");
            BufferedReader bufReader = new BufferedReader(fileReader);
            String line;


            while ((line = bufReader.readLine()) != null) {
                System.out.println(line);
                String[] tokens = line.split("//|");

                int id = Integer.parseInt(tokens[0].trim());
                String name = line[1].trim();
                double hourlyRate = Double.parseDouble(tokens[2].trim());
                double hoursWorked = Double.parseDouble(tokens[3].trim());

                Employee emp = new Employee(id, String name, hourlyRate, hoursWorked);

                System.out.println("\"ID: %d | Name: %-20s | Gross Pay: $%.2f%n\","),
                        emp.getId(), emp.getName(), emp.getGrossPay());


            }
            bufReader.close();
        } catch (
                IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        } catch (
                NumberFormatException e) {
            System.out.println("Invalid number format in file.");
        }
    }
}
