package com.kovan.intern.javatraining.service.impl.oops;

import com.kovan.intern.javatraining.model.AppConfig;
import org.springframework.stereotype.Service;

@Service
public class AppConfigTest {
    public void demonstrate(){
        AppConfig appConfig1= AppConfig.getInstance();
        AppConfig appConfig2= AppConfig.getInstance();
        AppConfig appConfig3= AppConfig.getInstance();
        System.out.println(appConfig1==appConfig2);
        System.out.println(appConfig2==appConfig3);
    }
    
    // Original main method preserved for reference
    // public static void main(String[] args) {
    //     AppConfigTest act = new AppConfigTest();
    //     act.demonstrate();
    // }
}
