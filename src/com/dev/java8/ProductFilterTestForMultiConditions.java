package com.dev.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProductFilterTestForMultiConditions {
    public static void main(String[] args) {
        // Assuming you have a list of products
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "book", 15.99));
        products.add(new Product(2, "book", 10.99));
        products.add(new Product(3, "electronic", 89.99));
        products.add(new Product(4, "book", 12.49));
        products.add(new Product(5, "clothing", 29.99));

        // Using Java 8 stream to find the product with the minimum price for the book category
        Optional<Product> minBookProduct = products.stream()
                .filter(product -> "book".equals(product.getCategory()))
                .min((p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice()));

        if (minBookProduct.isPresent()) {
            Product cheapestBook = minBookProduct.get();
            System.out.println("Product ID with the minimum price for the book category: " + cheapestBook.getProductId());
        } else {
            System.out.println("Product ID with the minimum price for the book category: "+"");
        }
    }
}