package com.kovan.intern.javatraining.service.impl.interfaces;

import com.kovan.intern.javatraining.model.SmartPhone;
import org.springframework.stereotype.Service;

@Service
public class SmartPhoneMultipleInterfaceDemo {
    public void demonstrate(){
        SmartPhone smartPhone = new SmartPhone();
        smartPhone.start();
        smartPhone.call();
        smartPhone.defaultStart();
    }
    
    // Original main method preserved for reference
    // public static void main(String[] args) {
    //     SmartPhoneMultipleInterfaceDemo spmid = new SmartPhoneMultipleInterfaceDemo();
    //     spmid.demonstrate();
    // }
}
