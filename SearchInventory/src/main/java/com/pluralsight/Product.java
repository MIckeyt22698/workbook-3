package com.pluralsight;

public class Product {
    private int id;
    private String productname;
    private double price;

    public Product(int id, double price, String productname) {
        this.id = id;
        this.price = price;
        this.productname = productname;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String toString(){
        return String.format("ID %d | Product: %s-10 | Price: $%.2f", id, productname, price);
    }
}

