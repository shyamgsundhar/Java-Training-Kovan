package com.kovan.intern.javatraining.model;

public class ObjectCounter {
    private static int count=0;
    private ObjectCounter(){
    }
    public static int getCount(){
        if(count==0) count++;
        System.out.println(System.identityHashCode(count));
        return count;
    }
}
