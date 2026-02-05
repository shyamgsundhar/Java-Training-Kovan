package com.kovan.intern.javatraining.model;

public class AppConfig {
    private static AppConfig appConfig;
    private AppConfig(){
        System.out.println("Constructed Called");
    }
    public static AppConfig getInstance(){
        if(appConfig==null){
            appConfig=new AppConfig();
            System.out.println("New Instance Created");
        }
        return appConfig;
    }
}
