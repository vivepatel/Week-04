package com.generics.online_marketplace;

public class Gadget extends Product {
    private GadgetCategory category;

    public Gadget(String name, double price, GadgetCategory category) {
        super(name, price);
        this.category = category;
    }

    public GadgetCategory getCategory() {
        return category;
    }

    @Override
    public void display() {
        System.out.println("Gadget: " + getName() + " | Price: INR " + getPrice() + " | Category: " + category);
    }
}
