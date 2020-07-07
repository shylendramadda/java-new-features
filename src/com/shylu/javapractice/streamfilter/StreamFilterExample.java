package com.shylu.javapractice.streamfilter;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Shylendra Madda
 */
public class StreamFilterExample {
    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<>();
        //Adding Products
        productsList.add(new Product(1, "HP Laptop", 25000f));
        productsList.add(new Product(2, "Dell Laptop", 30000f));
        productsList.add(new Product(3, "Lenevo Laptop", 28000f));
        productsList.add(new Product(4, "Sony Laptop", 28000f));
        productsList.add(new Product(5, "Apple Laptop", 90000f));
        productsList.stream()
                .filter(p -> p.price > 30000)   // filtering price
                .map(pm -> pm.price)          // fetching price
                .forEach(System.out::println);  // iterating price

        List<Float> pricesList = productsList.stream()
                .filter(p -> p.price > 30000)   // filtering price
                .map(pm -> pm.price)          // fetching price
                .collect(Collectors.toList()); // fetching filtered data as a list.
        System.out.println(pricesList);
    }
}

class Product {
    int id;
    String name;
    float price;

    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
