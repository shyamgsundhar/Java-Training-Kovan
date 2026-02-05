package com.kovan.intern.javatraining.service.impl.interfaces;

import com.kovan.intern.javatraining.model.CarPolicy;
import com.kovan.intern.javatraining.model.Audi;
import com.kovan.intern.javatraining.model.BMW;
import org.springframework.stereotype.Service;

@Service
public class CarInterfaceDemo {
    public void demonstrate(){
        CarPolicy car1= new Audi();
        car1.startEngine();
        car1.applyBrake();
        System.out.println("----------------");
        CarPolicy car2= new BMW();
        car2.startEngine();
        car2.applyBrake();
        System.out.println("----------------");
    }
    
    // Original main method preserved for reference
    // public static void main(String[] args) {
    //     CarInterfaceDemo cid = new CarInterfaceDemo();
    //     cid.demonstrate();
    // }
}
