package com.shylu.javapractice.lambdas;

interface Sayable1 {
    public String say(String name);
}

public class LambdaExpressionExample4 {
    public static void main(String[] args) {

        // Lambda expression with single parameter.  
        Sayable1 s1 = (name) -> {
            return "Hello, " + name;
        };
        System.out.println(s1.say("Sonoo"));

        // You can omit function parentheses    
        Sayable1 s2 = name -> {
            return "Hello, " + name;
        };
        System.out.println(s2.say("Sonoo"));
    }
}  