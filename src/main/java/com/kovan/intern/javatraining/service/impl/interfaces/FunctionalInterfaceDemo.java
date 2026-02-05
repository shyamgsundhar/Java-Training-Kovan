package com.kovan.intern.javatraining.service.impl.interfaces;

import com.kovan.intern.javatraining.model.SquareCalculator;
import org.springframework.stereotype.Service;

@Service
public class FunctionalInterfaceDemo {
    public int calculateSquare(int x){
        SquareCalculator s = (int a)->a*a;
        return s.calculate(x);
    }
    
    public void demonstrate(){
        int x=41;
        int ans = calculateSquare(x);
        System.out.println(ans);
    }
    
    // Original main method preserved for reference
    // public static void main(String[] args) {
    //     FunctionalInterfaceDemo fid = new FunctionalInterfaceDemo();
    //     fid.demonstrate();
    // }
}
