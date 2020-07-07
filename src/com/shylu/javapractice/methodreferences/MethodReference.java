package com.shylu.javapractice.methodreferences;

interface Sayable {
    void say();
}

// In the following example, we have defined a functional interface and referring a static method to it's functional method say().
public class MethodReference {
    public static void saySomething() {
        System.out.println("Hello, this is static method.");
    }

    public static void main(String[] args) {
        // Referring static method  
        Sayable sayable = MethodReference::saySomething;
        // Calling interface method  
        sayable.say();
    }
}  