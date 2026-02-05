package com.kovan.intern.javatraining.service.impl.oops;

import com.kovan.intern.javatraining.model.ObjectCounter;
import org.springframework.stereotype.Service;

@Service
public class ObjectCounterDemo {
    public void demonstrate(){
        int objectCounter1= ObjectCounter.getCount();
        int objectCounter2= ObjectCounter.getCount();
        int objectCounter3= ObjectCounter.getCount();
        System.out.println("Total of Objects Created "+ObjectCounter.getCount());
        System.out.println(objectCounter1==objectCounter2);
    }
    
    // Original main method preserved for reference
    // public static void main(String[] args) {
    //     ObjectCounterDemo ocd = new ObjectCounterDemo();
    //     ocd.demonstrate();
    // }
}
