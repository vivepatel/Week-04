package com.generics.warehouse_management_system;

public class Furniture extends WarehouseItem {
    public Furniture(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("Furniture: " + getName());
    }
}