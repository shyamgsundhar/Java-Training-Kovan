package org.kovan.intern.oops_and_architectural_thinking.interfaces_and_abstract_classes;

class Vehicle {
    void start() {
        System.out.println("Vehicle started");
    }
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car started");
    }

    void drive() {
        System.out.println("Driving car");
    }
}

public class UpcastingExample {
    public static void main(String[] args) {
        Vehicle v = new Car();
        v.start();
    }
}
