package com.shylu.javapractice.foreachloop;

import java.util.ArrayList;
import java.util.List;

public class ForEachExample {
    public static void main(String[] args) {
        List<String> gamesList = new ArrayList<String>();
        gamesList.add("Football");
        gamesList.add("Cricket");
        gamesList.add("Chess");
        gamesList.add("Hocky");

        System.out.println("------------Iterating by passing lambda expression--------------");
        gamesList.forEach(games -> System.out.println(games));
        System.out.println("------------Iterating by passing method reference---------------");
        gamesList.forEach(System.out::println);

        // Ordered
        System.out.println("------------Iterating by passing lambda expression---------------");
        gamesList.stream().forEachOrdered(games -> System.out.println(games));
        System.out.println("------------Iterating by passing method reference---------------");
        gamesList.stream().forEachOrdered(System.out::println);

    }
}  