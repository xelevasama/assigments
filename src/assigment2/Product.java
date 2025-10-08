package assigment2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

// Product class
class Product {
    private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }

    @Override
    public String toString() {
        return "ID: " + id + " | " + name + " | $" + price;
    }
}
