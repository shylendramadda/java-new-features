package com.shylu.javapractice.lambdas;

interface Sayable {
    String say();
}

public class LambdaExpressionExample3 {
    public static void main(String[] args) {
        Sayable s = () -> "I have nothing to say.";
        System.out.println(s.say());
    }
}  