package org.kovan.intern.oops_and_architectural_thinking.composition_over_inheritance;

class Processor{
    String name;
    Processor(String name){
        this.name=name;
    }
}
class Ram{
    int size;
    Ram(int size){
        this.size=size;
    }
}
class Storage{
    String type;
    int size;
    Storage(String type, int size) {
        this.size = size;
        this.type = type;
    }
}
class Computer{
    Processor processor;
    Ram ram;
    Storage storage;
    Computer(Processor processor,Ram ram,Storage storage){
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
public class PCBuilderDemo {
    public static void main(String[] args) {
        Processor processor=new Processor("Ryzen5");
        Ram ram=new Ram(8);
        Storage storage=new Storage("HDD",512);
        Computer computer= new Computer(processor,ram,storage);
        computer.display();
        computer.upgradeRam(16);
        computer.display();
    }
}
