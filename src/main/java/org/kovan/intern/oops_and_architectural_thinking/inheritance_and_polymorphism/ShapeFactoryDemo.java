package org.kovan.intern.oops_and_architectural_thinking.inheritance_and_polymorphism;

class Shape{
    double area(){
        return 0.0;
    }
}
class Circle extends Shape{
    double radius;
    Circle(double radius){
        this.radius=radius;
    }
    double area(){
        return Math.PI*radius*radius;
    }
}
class Square extends Shape{
    double side;
    Square(double side){
        this.side=side;
    }
    double area(){
        return side*side;
    }
}

public class ShapeFactoryDemo {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[]{
                new Circle(10),
                new Circle(5),
                new Square(4)
        };
        for(Shape shape : shapes){
            System.out.println(shape.area());
        }
    }
}
