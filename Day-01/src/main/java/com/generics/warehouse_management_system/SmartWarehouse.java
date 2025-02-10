package com.generics.warehouse_management_system;

public class SmartWarehouse {
    public static void main(String[] args) {
        Storage<Electronics> electronics = new Storage<>();
        electronics.addItem(new Electronics("Phone"));
        electronics.addItem(new Electronics("SmartWatch"));

        Storage<Groceries> groceries = new Storage<>();
        groceries.addItem(new Groceries("Bread"));
        groceries.addItem(new Groceries("Butter"));

        Storage<Furniture> furniture = new Storage<>();
        furniture.addItem(new Furniture("Chair"));
        furniture.addItem(new Furniture("Table"));

        System.out.println("Electronics Storage:");
        WarehouseUtility.displayAllItems(electronics.getItems());

        System.out.println("\nGroceries Storage:");
        WarehouseUtility.displayAllItems(groceries.getItems());

        System.out.println("\nFurniture Storage:");
        WarehouseUtility.displayAllItems(furniture.getItems());
    }
}
