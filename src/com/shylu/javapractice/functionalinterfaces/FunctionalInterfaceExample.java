package com.shylu.javapractice.functionalinterfaces;

@FunctionalInterface
interface sayable {
    void say(String msg);

    // It can contain any number of Object class methods.
    int hashCode();

    String toString();

    boolean equals(Object obj);
}

public class FunctionalInterfaceExample implements sayable {
    public void say(String msg) {
        System.out.println(msg);
    }

    public static void main(String[] args) {
        FunctionalInterfaceExample fie = new FunctionalInterfaceExample();
        fie.say("Hello there");
    }
}  