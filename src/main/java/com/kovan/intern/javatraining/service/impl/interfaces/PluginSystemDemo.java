package com.kovan.intern.javatraining.service.impl.interfaces;

import com.kovan.intern.javatraining.model.Plugin;
import com.kovan.intern.javatraining.model.CoreEngine;
import org.springframework.stereotype.Service;

@Service
public class PluginSystemDemo {
    public void demonstrate(){
        Plugin plugin1= new Plugin() {
            @Override
            public void execute() {
                System.out.println("First Plugin");
            }
        };

        Plugin plugin2 = new Plugin() {
            @Override
            public void execute() {
                System.out.println("Second Plugin");
            }
        };

        Plugin plugin3=new Plugin() {
            @Override
            public void execute() {
                System.out.println("Third Plugin");
            }
        };
        Plugin[] plugins={
                plugin1,plugin2,plugin3
        };
        CoreEngine coreEngine = new CoreEngine();
        coreEngine.runPlugins(plugins);
    }
    
    // Original main method preserved for reference
    // public static void main(String[] args) {
    //     PluginSystemDemo psd = new PluginSystemDemo();
    //     psd.demonstrate();
    // }
}
