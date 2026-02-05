package com.kovan.intern.javatraining.service.impl.interfaces;

import com.kovan.intern.javatraining.model.DefaultCarPolicy;
import com.kovan.intern.javatraining.model.DefaultAudi;
import com.kovan.intern.javatraining.model.DefaultBMW;
import org.springframework.stereotype.Service;

@Service
public class DefaultCarInterfaceDemo {
    public void demonstrate(){
        DefaultCarPolicy car1= new DefaultAudi();
        car1.startEngine();
        car1.applyBrake();
        car1.horn();
        System.out.println("----------------");
        DefaultCarPolicy car2= new DefaultBMW();
        car2.startEngine();
        car2.applyBrake();
        car2.horn();
        System.out.println("----------------");
    }
    
    // Original main method preserved for reference
    // public static void main(String[] args) {
    //     DefaultCarInterfaceDemo dcid = new DefaultCarInterfaceDemo();
    //     dcid.demonstrate();
    // }
}
