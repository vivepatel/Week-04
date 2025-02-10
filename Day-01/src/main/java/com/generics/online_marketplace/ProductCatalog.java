package com.generics.online_marketplace;

import java.util.ArrayList;
import java.util.List;

public class ProductCatalog<T extends Product> {
    private List<T> products = new ArrayList<>();

    public void addProduct(T product) {
        products.add(product);
    }

    public List<T> getProducts() {
        return products;
    }
}
