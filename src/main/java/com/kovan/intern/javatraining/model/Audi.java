package com.kovan.intern.javatraining.model;

public class Audi implements CarPolicy {
    @Override
    public void startEngine() {
        System.out.println("Audi Engine Started");
    }

    @Override
    public void applyBrake() {
        System.out.println("Audi Brake Applied");
    }
}
