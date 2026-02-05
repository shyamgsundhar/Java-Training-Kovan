package com.kovan.intern.javatraining.model;

public interface Camera {
    void start();
    default void defaultStart(){
        System.out.println("Camera Started");
    }
}
