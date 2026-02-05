package com.kovan.intern.javatraining.service.impl.memory;

import org.springframework.stereotype.Service;

@Service
public class OverflowTest {
    public void demonstrate(){
        byte bt = 126;
        for(int i=0;i<5;i++){
            System.out.println("value: " + bt);
            bt++;
        }
    }
    
    // Original main method preserved for reference
    // public static void main(String[] args) {
    //     OverflowTest ot = new OverflowTest();
    //     ot.demonstrate();
    // }
}
