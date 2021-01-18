package com.company;

import java.util.Arrays;

public class Book2 {

    private String name;
    private Author[] authors;
    private double price;
    private int quantity;

    public Book2(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book2(String name, Author[] authors, double price, int quantity) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }


    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "BookB{" +
                "name='" + name + '\'' +
                ", authors=" + Arrays.toString(authors) +
                ", price=" + price +
                ", qty=" + quantity +
                '}';
    }

}
