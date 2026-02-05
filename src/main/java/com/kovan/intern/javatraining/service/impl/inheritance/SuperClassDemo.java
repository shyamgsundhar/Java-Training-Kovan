package com.kovan.intern.javatraining.service.impl.inheritance;

import com.kovan.intern.javatraining.model.Child;
import org.springframework.stereotype.Service;

@Service
public class SuperClassDemo {
    public void demonstrate(){
        Child child=new Child();
        child.display();
    }
    
    // Original main method preserved for reference
    // public static void main(String[] args) {
    //     SuperClassDemo scd = new SuperClassDemo();
    //     scd.demonstrate();
    // }
}
