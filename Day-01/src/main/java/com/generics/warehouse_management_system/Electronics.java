package com.generics.warehouse_management_system;

public class Electronics extends WarehouseItem {
    public Electronics(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("Electronics: " + getName());
    }
}
