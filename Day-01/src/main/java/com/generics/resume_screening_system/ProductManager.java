package com.generics.resume_screening_system;

public class ProductManager extends JobRole {

    public ProductManager(String name, String description) {
        super(name, description);
    }

    @Override
    public void displayRoleDetails() {
        System.out.println("Product Manager: " + getName() + "\nDescription: " + getDescription());
    }
}