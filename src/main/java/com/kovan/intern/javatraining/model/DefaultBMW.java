package com.kovan.intern.javatraining.model;

public class DefaultBMW implements DefaultCarPolicy {
    @Override
    public void startEngine() {
        System.out.println("BMW Engine Started");
    }

    @Override
    public void applyBrake() {
        System.out.println("BMW Brake Applied");
    }
}
