package com.shylu.javapractice.streams;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Shylendra Madda
 */
public class StreamWithSum {
    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<>();
        //Adding Products
        productsList.add(new Product(1, "HP Laptop", 25000f));
        productsList.add(new Product(2, "Dell Laptop", 30000f));
        productsList.add(new Product(3, "Lenevo Laptop", 28000f));
        productsList.add(new Product(4, "Sony Laptop", 28000f));
        productsList.add(new Product(5, "Apple Laptop", 90000f));
        // Using Collectors's method to sum the prices.
        double totalPrice3 = productsList.stream().mapToDouble(product -> product.price).sum();
        System.out.println(totalPrice3);
    }
}
