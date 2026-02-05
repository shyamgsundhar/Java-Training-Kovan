package com.kovan.intern.javatraining.service.impl.memory;

import org.springframework.stereotype.Service;

@Service
public class MemoryTest {
    public void demonstrate(){
        String s1="Hello";
        String s2="Hello";
        String s3=new String("Hello");
        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s2));
        System.out.println(System.identityHashCode(s3));
        System.out.println(s1==s2);
        System.out.println(s1==s3);
    }
    
    // Original main method preserved for reference
    // public static void main(String[] args) {
    //     MemoryTest mt = new MemoryTest();
    //     mt.demonstrate();
    // }
}
