package com.kovan.intern.javatraining.model;

public interface DefaultCarPolicy {
    void startEngine();
    void applyBrake();
    default void horn(){
        System.out.println("Horn is Applied");
    }
}
