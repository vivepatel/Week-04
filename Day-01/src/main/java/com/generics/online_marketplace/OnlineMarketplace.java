package com.generics.online_marketplace;

import java.util.ArrayList;
import java.util.List;

public class OnlineMarketplace {
    public static void main(String[] args) {
        ProductCatalog<Book> bookCatalog = new ProductCatalog<>();
        ProductCatalog<Clothing> clothingCatalog = new ProductCatalog<>();
        ProductCatalog<Gadget> gadgetCatalog = new ProductCatalog<>();

        // Adding products
        Book book1 = new Book("Harry Potter", 250, BookCategory.FICTION);
        Clothing clothing1 = new Clothing("Top", 599, ClothingCategory.WOMEN);
        Gadget gadget1 = new Gadget("SmartWatch", 1299, GadgetCategory.ACCESSORY);

        bookCatalog.addProduct(book1);
        clothingCatalog.addProduct(clothing1);
        gadgetCatalog.addProduct(gadget1);

        System.out.println("Before Discounts:");
        book1.display();
        clothing1.display();
        gadget1.display();

        System.out.println("\nApplying Discounts:");
        MarketplaceUtility.applyDiscount(book1, 10);
        MarketplaceUtility.applyDiscount(clothing1, 15);
        MarketplaceUtility.applyDiscount(gadget1, 5);

        System.out.println("\nAfter Discounts:");
        book1.display();
        clothing1.display();
        gadget1.display();
    }
}