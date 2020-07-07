package com.shylu.javapractice.methodreferences;

import java.util.function.BiFunction;

class ArithmeticNonStatic {
    public int add(int a, int b) {
        return a + b;
    }
}

public class InstanceMethodReference3 {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> adder = new ArithmeticNonStatic()::add;
        int result = adder.apply(10, 20);
        System.out.println(result);
    }
}  