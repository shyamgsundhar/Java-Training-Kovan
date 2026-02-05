package com.kovan.intern.javatraining.model;

public class InstanceControlTest {
    private static InstanceControlTest instanceControlDemo;
    private InstanceControlTest(){
    }
    public static InstanceControlTest getInstance(){
        if(instanceControlDemo==null) {
            instanceControlDemo = new InstanceControlTest();
        }
        return instanceControlDemo;
    }
}
