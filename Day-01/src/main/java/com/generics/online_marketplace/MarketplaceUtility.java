package com.generics.online_marketplace;

public class MarketplaceUtility {
    public static <T extends Product> void applyDiscount(T product, double percentage) {
        double discountAmount = product.getPrice() * (percentage / 100);
        product.setPrice(product.getPrice() - discountAmount);
        System.out.println("Applied " + percentage + "% discount to " + product.getName() + ". New Price: INR " + product.getPrice());
    }
}
