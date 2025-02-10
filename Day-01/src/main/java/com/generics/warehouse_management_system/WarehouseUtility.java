package com.generics.warehouse_management_system;
import java.util.List;
public class WarehouseUtility {
    public static void displayAllItems(List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items) {
            item.display();
        }
    }
}
