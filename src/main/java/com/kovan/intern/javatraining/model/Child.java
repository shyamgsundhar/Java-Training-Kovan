package com.kovan.intern.javatraining.model;

public class Child extends Parent {
    public int id=60;
    public void display(){
        System.out.println("Here: "+id);
        System.out.println("Parent: "+super.id);
    }
}
