package com.shylu.javapractice.stringjoiner;

import java.util.StringJoiner;

/**
 * @author Shylendra Madda
 */
public class StringJoinerWithPrefixSuffix {
    public static void main(String[] args) {
        StringJoiner joinNames = new StringJoiner(",", "[", "]");   // passing comma(,) and square-brackets as delimiter

        // Adding values to StringJoiner
        joinNames.add("Jay");
        joinNames.add("Raju");
        joinNames.add("Balu");
        joinNames.add("Shylu");

        System.out.println(joinNames);
    }
}
