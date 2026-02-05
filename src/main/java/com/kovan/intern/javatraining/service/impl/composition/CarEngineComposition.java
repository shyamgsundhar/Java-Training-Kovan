package com.kovan.intern.javatraining.service.impl.composition;

import com.kovan.intern.javatraining.model.Car;
import com.kovan.intern.javatraining.model.PetrolEngine;
import org.springframework.stereotype.Service;

@Service
public class CarEngineComposition {
    public void demonstrate(){
        Car car1 = new Car(new PetrolEngine());
        car1.drive();
    }
    
    // Original main method preserved for reference
    // public static void main(String[] args) {
    //     CarEngineComposition cec = new CarEngineComposition();
    //     cec.demonstrate();
    // }
}
