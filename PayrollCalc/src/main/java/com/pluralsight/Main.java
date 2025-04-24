package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try {
            Scanner keystroke = new Scanner(System.in);

            System.out.println("enter the name of the employee input file");
            String inputFile = keystroke.nextLine();

            System.out.print("Enter the name of the payroll output file to create: ");
            String outputFile = keystroke.nextLine();

            FileReader fileReader = new FileReader("DataFiles/" + inputFile);
            BufferedReader bufReader = new BufferedReader(fileReader);


            FileWriter fileWriter = new FileWriter("DataFiles/" + outputFile);
            fileWriter.write("id|name|gross pay\n");

            bufReader.readLine();

            String line;
            while ((line = bufReader.readLine()) != null) {
                System.out.println(line);
                String[] tokens = line.split("\\|");

                int id = Integer.parseInt(tokens[0].trim());
                String name = tokens[1].trim();
                double payRate = Double.parseDouble(tokens[2].trim());
                double hoursWorked = Double.parseDouble(tokens[3].trim());

                Employee emp = new Employee(id, name, payRate, hoursWorked);

                System.out.printf("ID: %d | Name: %-20s | Gross Pay: $%.2f%n",
                        emp.getId(), emp.getName(), emp.getGrossPay());

                fileWriter.write(String.format("%d|%s|%.2f%n",
                        emp.getId(), emp.getName(), emp.getGrossPay()));

            }
            bufReader.close();
            fileWriter.close();
        } catch (
                IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        } catch (
                NumberFormatException e) {
            System.out.println("Invalid number format in file.");
        }
    }
}
