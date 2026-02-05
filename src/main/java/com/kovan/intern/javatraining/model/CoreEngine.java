package com.kovan.intern.javatraining.model;

public class CoreEngine {
    public void runPlugins(Plugin[] plugins){
        for(Plugin plugin:plugins){
            System.out.println(plugin);
        }
    }
}
