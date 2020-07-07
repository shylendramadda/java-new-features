package com.shylu.javapractice.collectors;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

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

public class CollectorsExample {
    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<>();
        //Adding Products  
        productsList.add(new Product(1, "HP Laptop", 25000f));
        productsList.add(new Product(2, "Dell Laptop", 30000f));
        productsList.add(new Product(3, "Lenevo Laptop", 28000f));
        productsList.add(new Product(4, "Sony Laptop", 28000f));
        productsList.add(new Product(5, "Apple Laptop", 90000f));

        List<Float> productPriceList =
                productsList.stream()
                        .map(x -> x.price)         // fetching price
                        .collect(Collectors.toList());  // collecting as list
        System.out.println(productPriceList);

        // as a Set
        Set<Float> productPriceListSet =
                productsList.stream()
                        .map(x -> x.price)         // fetching price
                        .collect(Collectors.toSet());   // collecting as list
        System.out.println(productPriceListSet);

        // Sum
        double sumPrices =
                productsList.stream().mapToDouble(x -> x.price).sum();  // collecting as list
        System.out.println("Sum of prices: " + sumPrices);
        int sumId =
                productsList.stream().mapToInt(x -> x.id).sum();
        System.out.println("Sum of id's: " + sumId);

        // Average
        Double average = productsList.stream()
                .collect(Collectors.averagingDouble(p -> p.price));
        System.out.println("Average price is: " + average);

        // Count
        long noOfElements = productsList.size();
        System.out.println("Total elements : " + noOfElements);
    }
}  