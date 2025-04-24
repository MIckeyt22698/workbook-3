package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArrayList<Product> inventory = getInventory();
        Scanner keystroke = new Scanner(System.in);
        System.out.println("Current Inventory:");
        for (Product item : inventory) {
            System.out.printf("ID %d | Product: %-10s | Price: $%.2f",
                    item.getId(), item.getProductname(), item.getPrice());
        }
    }

    public static ArrayList<Product> getInventory() {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product(1, .99, "Apple"));
        products.add(new Product(2, 1.17, "Orange"));
        products.add(new Product(3, 1.37, "Banana"));
        products.add(new Product(4, 3.47, "Pineapple"));
        products.add(new Product(5, 2.17, "Mango"));
        return products;


    }
}


