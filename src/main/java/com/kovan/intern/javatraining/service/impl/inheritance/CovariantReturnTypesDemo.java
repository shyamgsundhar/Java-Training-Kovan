package com.kovan.intern.javatraining.service.impl.inheritance;

import com.kovan.intern.javatraining.model.Shapes;
import com.kovan.intern.javatraining.model.Circles;
import org.springframework.stereotype.Service;

@Service
public class CovariantReturnTypesDemo {
    public void demonstrate(){
        Shapes s = new Circles();
        Circles c = (Circles) s.draw();
        System.out.println("Covariant return type example");
    }
    
    // Original main method preserved for reference
    // public static void main(String[] args) {
    //     CovariantReturnTypesDemo crtd = new CovariantReturnTypesDemo();
    //     crtd.demonstrate();
    // }
}
