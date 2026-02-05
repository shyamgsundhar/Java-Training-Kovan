package com.kovan.intern.javatraining.service.impl.inheritance;

import com.kovan.intern.javatraining.model.Animal;
import com.kovan.intern.javatraining.model.Dog;
import org.springframework.stereotype.Service;

@Service
public class MethodOverridingDemo {
    public void demonstrate(){
        Animal a = new Animal();
        a.sound();
        Dog d = new Dog();
        d.sounds();
    }
    
    // Original main method preserved for reference
    // public static void main(String[] args) {
    //     MethodOverridingDemo mod = new MethodOverridingDemo();
    //     mod.demonstrate();
    // }
}
