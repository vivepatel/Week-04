package shopingcart;

import java.util.*;

public class ShoppingCart {

    // Map to store product prices by product name
    private Map<String, Double> productPrices;
    // Map to maintain the order of items added (LinkedHashMap)
    private Map<String, Integer> cart;
    // Map to display items sorted by price (TreeMap)
    private Map<Double, List<String>> sortedByPriceMap;

    public ShoppingCart() {
        productPrices = new HashMap<>();
        cart = new LinkedHashMap<>();
        sortedByPriceMap = new TreeMap<>();
    }

    // Add product to product catalog
    public void addProductToCatalog(String productName, double price) {
        productPrices.put(productName, price);
    }

    // Add product to cart
    public void addToCart(String productName, int quantity) {
        if (productPrices.containsKey(productName)) {
            cart.put(productName, cart.getOrDefault(productName, 0) + quantity);
        } else {
            System.out.println("Product not found in catalog.");
        }
    }

    // Remove product from cart
    public void removeFromCart(String productName) {
        if (cart.containsKey(productName)) {
            cart.remove(productName);
        } else {
            System.out.println("Product not found in cart.");
        }
    }

    // View items in the cart with quantities and prices (in insertion order)
    public void viewCart() {
        System.out.println("Items in Cart (Insertion Order): ");
        for (Map.Entry<String, Integer> entry : cart.entrySet()) {
            String productName = entry.getKey();
            int quantity = entry.getValue();
            double price = productPrices.get(productName);
            System.out.println(productName + " - " + quantity + " x $" + price + " = $" + (price * quantity));
        }
    }

    // View items sorted by price (ascending)
    public void viewCartSortedByPrice() {
        // Clear the TreeMap and add products sorted by price
        sortedByPriceMap.clear();

        for (Map.Entry<String, Integer> entry : cart.entrySet()) {
            String productName = entry.getKey();
            int quantity = entry.getValue();
            double price = productPrices.get(productName);
            sortedByPriceMap.computeIfAbsent(price, k -> new ArrayList<>()).add(productName);
        }

        System.out.println("\nItems Sorted by Price (Ascending): ");
        for (Map.Entry<Double, List<String>> entry : sortedByPriceMap.entrySet()) {
            double price = entry.getKey();
            for (String productName : entry.getValue()) {
                int quantity = cart.get(productName);
                System.out.println(productName + " - " + quantity + " x $" + price + " = $" + (price * quantity));
            }
        }
    }

    // Get the total price of the cart
    public double getTotalPrice() {
        double totalPrice = 0.0;
        for (Map.Entry<String, Integer> entry : cart.entrySet()) {
            String productName = entry.getKey();
            int quantity = entry.getValue();
            totalPrice += productPrices.get(productName) * quantity;
        }
        return totalPrice;
    }

    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();

        // Add some products to the catalog
        shoppingCart.addProductToCatalog("Laptop", 899.99);
        shoppingCart.addProductToCatalog("Phone", 499.99);
        shoppingCart.addProductToCatalog("Headphones", 199.99);
        shoppingCart.addProductToCatalog("Smartwatch", 149.99);

        // Add products to the shopping cart
        shoppingCart.addToCart("Laptop", 1);
        shoppingCart.addToCart("Phone", 2);
        shoppingCart.addToCart("Headphones", 1);
        shoppingCart.addToCart("Smartwatch", 3);

        // View items in cart in insertion order
        shoppingCart.viewCart();

        // View items in cart sorted by price
        shoppingCart.viewCartSortedByPrice();

        // Get the total price of the cart
        System.out.println("\nTotal Price of Cart: $" + shoppingCart.getTotalPrice());

        // Remove an item from the cart
        shoppingCart.removeFromCart("Headphones");

        // View the updated cart
        System.out.println("\nUpdated Cart:");
        shoppingCart.viewCart();
    }
}
