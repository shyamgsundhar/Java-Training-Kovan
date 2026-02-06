package org.kovan.intern.oops_and_architectural_thinking.interfaces_and_abstract_classes;

interface CarPolicy{
    void startEngine();
    void applyBrake();
}

class Audi implements CarPolicy{
    @Override
    public void startEngine() {
        System.out.println("Audi Engine Started");
    }

    @Override
    public void applyBrake() {
        System.out.println("Audi Brake Applied");
    }
}

class BMW implements CarPolicy{
    @Override
    public void startEngine() {
        System.out.println("BMW Engine Started");
    }

    @Override
    public void applyBrake() {
        System.out.println("BMW Brake Applied");
    }
}
public class CarInterfaceDemo {
    public static void main(String[] args) {
        CarPolicy car1= new Audi();
        car1.startEngine();
        car1.applyBrake();
        System.out.println("----------------");
        CarPolicy car2= new BMW();
        car2.startEngine();
        car2.applyBrake();
        System.out.println("----------------");
    }
}
