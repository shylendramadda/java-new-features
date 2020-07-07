package com.shylu.javapractice.lambdas;

/**
 * @author Shylendra Madda
 */

/*Lambda expression helps us to write our code in functional style. It provides a clear and concise way to implement SAM interface(Single Abstract Method) by using an expression. It is very useful in collection library in which it helps to iterate, filter and extract data.*/

public class LambdaExpressionExample {
    public static void main(String[] args) {
        int width = 10;
        //without lambda, Drawable implementation using anonymous class  
        Drawable d = new Drawable() {
            public void draw() {
                System.out.println("Drawing " + width);
            }
        };
        d.draw();
    }
}  