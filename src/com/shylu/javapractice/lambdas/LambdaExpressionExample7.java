package com.shylu.javapractice.lambdas;

import java.util.ArrayList;
import java.util.List;

public class LambdaExpressionExample7 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Shylu");
        list.add("Balu");
        list.add("Raju");
        list.add("Ram");
        list.add("Jay");

        list.forEach(
                System.out::println
        );
    }
}  