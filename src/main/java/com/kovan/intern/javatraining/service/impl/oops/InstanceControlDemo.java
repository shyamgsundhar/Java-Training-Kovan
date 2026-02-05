package com.kovan.intern.javatraining.service.impl.oops;

import com.kovan.intern.javatraining.model.InstanceControlTest;
import org.springframework.stereotype.Service;

@Service
public class InstanceControlDemo {
    public void demonstrate(){
        InstanceControlTest test1= InstanceControlTest.getInstance();
        InstanceControlTest test2= InstanceControlTest.getInstance();
        System.out.println(test1==test2);
    }
    
    // Original main method preserved for reference
    // public static void main(String[] args) {
    //     InstanceControlDemo icd = new InstanceControlDemo();
    //     icd.demonstrate();
    // }
}
