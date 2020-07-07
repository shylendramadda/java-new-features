package com.shylu.javapractice.streams;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Shylendra Madda
 */
public class StreamMaxMin {
    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<>();
        //Adding Products
        productsList.add(new Product(1, "HP Laptop", 25000f));
        productsList.add(new Product(2, "Dell Laptop", 30000f));
        productsList.add(new Product(3, "Lenevo Laptop", 28000f));
        productsList.add(new Product(4, "Sony Laptop", 28000f));
        productsList.add(new Product(5, "Apple Laptop", 90000f));
        // max() method to get max Product price
        Product productA = productsList.stream()
                .max((product1, product2) ->
                        product1.price > product2.price ? 1 : -1).get();

        System.out.println(productA.price);
        // min() method to get min Product price
        Product productB = productsList.stream()
                .max((product1, product2) ->
                        product1.price < product2.price ? 1 : -1).get();
        System.out.println(productB.price);

        // count number of products based on the filter
        long count = productsList.stream()
                .filter(product->product.price<30000)
                .count();
        System.out.println(count);
    }
}
