package com.shylu.javapractice.lambdas;

@FunctionalInterface
interface ISayable {
    String say(String message);
}

public class LambdaExpressionExample8{
    public static void main(String[] args) {  
      
        // You can pass multiple statements in lambda expression  
        ISayable person = (message)-> {
            String str1 = "I would like to say, ";
            return str1 + message;
        };  
            System.out.println(person.say("time is precious."));  
    }  
}  