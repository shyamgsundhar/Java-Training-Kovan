package com.kovan.intern.javatraining.model;

public class Computer {
    public Processor processor;
    public Ram ram;
    public Storage storage;
    public Computer(Processor processor,Ram ram,Storage storage){
        this.processor=processor;
        this.ram=ram;
        this.storage=storage;
    }
    public void display(){
        System.out.println("The Processor: "+processor.name);
        System.out.println("The Ram: "+ ram.size);
        System.out.println("The Storage Type "+storage.type);
        System.out.println("The Storage Size "+storage.size);
    }
    public void upgradeRam(int size){
        this.ram.size=size;
        System.out.println("The Ram Updated "+ram.size);
    }
}
