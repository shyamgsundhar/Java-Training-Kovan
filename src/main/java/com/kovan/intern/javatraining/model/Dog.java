package com.kovan.intern.javatraining.model;

public class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }

    public void eat() {
        System.out.println("Dog eats");
    }
}
