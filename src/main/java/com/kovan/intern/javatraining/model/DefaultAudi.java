package com.kovan.intern.javatraining.model;

public class DefaultAudi implements DefaultCarPolicy {
    @Override
    public void startEngine() {
        System.out.println("Audi Engine Started");
    }

    @Override
    public void applyBrake() {
        System.out.println("Audi Brake Applied");
    }
}
