package com.kovan.intern.javatraining.service.impl.composition;

import com.kovan.intern.javatraining.model.Processor;
import com.kovan.intern.javatraining.model.Ram;
import com.kovan.intern.javatraining.model.Storage;
import com.kovan.intern.javatraining.model.Computer;
import org.springframework.stereotype.Service;

@Service
public class PCBuilderDemo {
    public void demonstrate(){
        Processor processor=new Processor("Ryzen5");
        Ram ram=new Ram(8);
        Storage storage=new Storage("HDD",512);
        Computer computer= new Computer(processor,ram,storage);
        computer.display();
        computer.upgradeRam(16);
        computer.display();
    }
    
    // Original main method preserved for reference
    // public static void main(String[] args) {
    //     PCBuilderDemo pbd = new PCBuilderDemo();
    //     pbd.demonstrate();
    // }
}
