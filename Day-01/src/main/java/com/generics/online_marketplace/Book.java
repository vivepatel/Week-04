package com.generics.online_marketplace;

public class Book extends Product {
    private BookCategory category;

    public Book(String name, double price, BookCategory category) {
        super(name, price);
        this.category = category;
    }

    public BookCategory getCategory() {
        return category;
    }

    @Override
    public void display() {
        System.out.println("Book: " + getName() + " | Price: INR " + getPrice() + " | Category: " + category);
    }
}
