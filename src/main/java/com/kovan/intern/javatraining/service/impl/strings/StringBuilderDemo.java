package com.kovan.intern.javatraining.service.impl.strings;

import org.springframework.stereotype.Service;

@Service
public class StringBuilderDemo {
    public void demonstrate(){
        StringBuilder stringBuilder=new StringBuilder("Helllo");
        System.out.println(System.identityHashCode(stringBuilder));
        stringBuilder.append("Vanakkam");
        System.out.println(stringBuilder.toString());
        System.out.println(System.identityHashCode(stringBuilder));
    }
    
    // Original main method preserved for reference
    // public static void main(String[] args) {
    //     StringBuilderDemo sbd = new StringBuilderDemo();
    //     sbd.demonstrate();
    // }
}
