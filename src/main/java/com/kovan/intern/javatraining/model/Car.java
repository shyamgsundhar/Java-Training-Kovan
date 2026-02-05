package com.kovan.intern.javatraining.model;

public class Car {
    public Engines engines;
    public Car(Engines engines){
        this.engines=engines;
    }
    public void drive(){
        engines.start();
        System.out.println("Car Started");
    }
}
