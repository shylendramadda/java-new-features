package com.shylu.javapractice.optionalclass;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        String[] str = new String[10];
        /*String lowercaseString = str[5].toLowerCase();
        System.out.print(lowercaseString);*/ // Throws NPE

        Optional<String> checkNull = Optional.ofNullable(str[5]);
        if (checkNull.isPresent()) {  // check for value is present or not
            String lowercaseString2 = str[5].toLowerCase();
            System.out.print(lowercaseString2);
        } else {
            System.out.println("string value is not present");
        }

        str[5] = "JAVA OPTIONAL CLASS EXAMPLE";  // Setting value for 5th index
        Optional<String> checkNullTwo = Optional.ofNullable(str[5]);
        checkNull.ifPresent(System.out::println);   // printing value by using method reference
        System.out.println(checkNullTwo.get());    // printing value by using get method
        System.out.println(str[5].toLowerCase());
    }
}  