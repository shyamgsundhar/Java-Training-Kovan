package com.kovan.intern.javatraining.service.impl.oops;

import com.kovan.intern.javatraining.model.StaticContextTest;
import org.springframework.stereotype.Service;

@Service
public class StaticContextDemo {
    public void demonstrate(){
        System.out.println(StaticContextTest.name);
        StaticContextTest staticContextTest = new StaticContextTest();
        System.out.println(staticContextTest.id);
    }
    
    // Original main method preserved for reference
    // public static void main(String[] args) {
    //     StaticContextDemo scd = new StaticContextDemo();
    //     scd.demonstrate();
    // }
}
