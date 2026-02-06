package org.kovan.intern.oops_and_architectural_thinking.composition_over_inheritance;

interface Engines{
    void start();
}
class PetrolEngine implements Engines{
    @Override
    public void start(){
        System.out.println("Petrol Engine Started");
    }
}
class ElectricEngine implements Engines{
    @Override
    public void start() {
        System.out.println("Electric Engine Started");
    }
}

class Car{
    Engines engines;
    Car(Engines engines){
        this.engines=engines;
    }
    void drive(){
        engines.start();
        System.out.println("Car Started");
    }
}
public class CarEngineComposition {
    public static void main(String[] args) {
        Car car1 = new Car(new PetrolEngine());
        car1.drive();
    }
}
