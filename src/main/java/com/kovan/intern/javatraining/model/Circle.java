package com.kovan.intern.javatraining.model;

public class Circle extends Shape {
    public double radius;
    public Circle(double radius){
        this.radius=radius;
    }
    public double area(){
        return Math.PI*radius*radius;
    }
}
