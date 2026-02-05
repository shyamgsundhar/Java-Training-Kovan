package com.kovan.intern.javatraining.model;

public class Square extends Shape {
    public double side;
    public Square(double side){
        this.side=side;
    }
    public double area(){
        return side*side;
    }
}
