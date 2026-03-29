package org.kovan.intern.oops_and_architectural_thinking.interfaces_and_abstract_classes;

interface DefaultCarPolicy{
    void startEngine();
    void applyBrake();
    default void horn(){
        System.out.println("Horn is Applied");
    }
}

class DefaultAudi implements DefaultCarPolicy{
    @Override
    public void startEngine() {
        System.out.println("Audi Engine Started");
    }

    @Override
    public void applyBrake() {
        System.out.println("Audi Brake Applied");
    }
}

class DefaultBMW implements DefaultCarPolicy{
    @Override
    public void startEngine() {
        System.out.println("BMW Engine Started");
    }

    @Override
    public void applyBrake() {
        System.out.println("BMW Brake Applied");
    }
}
public class DefaultCarInterfaceDemo {
    public static void main(String[] args) {
        DefaultCarPolicy car1= new DefaultAudi();
        car1.startEngine();
        car1.applyBrake();
        car1.horn();
        System.out.println("----------------");
        DefaultCarPolicy car2= new DefaultBMW();
        car2.startEngine();
        car2.applyBrake();
        car2.horn();
        System.out.println("----------------");
    }
}
