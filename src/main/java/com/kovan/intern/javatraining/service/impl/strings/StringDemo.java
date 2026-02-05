package com.kovan.intern.javatraining.service.impl.strings;

import org.springframework.stereotype.Service;

@Service
public class StringDemo {
    public void demonstrate(){
        String st="Hello";
        System.out.println(System.identityHashCode(st));
        st=st+"Vanakkam";
        System.out.println(st);
        System.out.println(System.identityHashCode(st));
    }
    
    // Original main method preserved for reference
    // public static void main(String[] args) {
    //     StringDemo sd = new StringDemo();
    //     sd.demonstrate();
    // }
}
