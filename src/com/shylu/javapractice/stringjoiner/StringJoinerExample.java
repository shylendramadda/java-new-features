package com.shylu.javapractice.stringjoiner;

import java.util.StringJoiner;

public class StringJoinerExample {
    public static void main(String[] args) {
        StringJoiner joinNames = new StringJoiner(","); // passing comma(,) as delimiter   

        // Adding values to StringJoiner  
        joinNames.add("Jay");
        joinNames.add("Raju");
        joinNames.add("Balu");
        joinNames.add("Shylu");

        System.out.println(joinNames);
    }
}  