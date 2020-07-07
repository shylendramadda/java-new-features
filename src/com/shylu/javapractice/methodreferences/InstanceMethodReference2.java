package com.shylu.javapractice.methodreferences;

public class InstanceMethodReference2 {
    public void printMsg() {
        System.out.println("Hello, this is instance method");
    }

    public static void main(String[] args) {
        Thread t2 = new Thread(new InstanceMethodReference2()::printMsg);
        t2.start();
    }
}  