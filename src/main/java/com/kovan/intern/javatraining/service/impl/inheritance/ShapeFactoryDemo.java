package com.kovan.intern.javatraining.service.impl.inheritance;

import com.kovan.intern.javatraining.model.Shape;
import com.kovan.intern.javatraining.model.Circle;
import com.kovan.intern.javatraining.model.Square;
import org.springframework.stereotype.Service;

@Service
public class ShapeFactoryDemo {
    public void demonstrate(){
        Shape[] shapes = new Shape[]{
                new Circle(10),
                new Circle(5),
                new Square(4)
        };
        for(Shape shape : shapes){
            System.out.println(shape.area());
        }
    }
    
    // Original main method preserved for reference
    // public static void main(String[] args) {
    //     ShapeFactoryDemo sfd = new ShapeFactoryDemo();
    //     sfd.demonstrate();
    // }
}
