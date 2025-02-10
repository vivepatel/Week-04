package com.generics.online_marketplace;

public class Clothing extends Product {
    private ClothingCategory category;

    public Clothing(String name, double price, ClothingCategory category) {
        super(name, price);
        this.category = category;
    }

    public ClothingCategory getCategory() {
        return category;
    }

    @Override
    public void display() {
        System.out.println("Clothing: " + getName() + " | Price: INR " + getPrice() + " | Category: " + category);
    }
}
