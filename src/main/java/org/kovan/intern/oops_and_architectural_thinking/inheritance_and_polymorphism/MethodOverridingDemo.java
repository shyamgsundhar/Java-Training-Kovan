package org.kovan.intern.oops_and_architectural_thinking.inheritance_and_polymorphism;
class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
    void sounds() {
        System.out.println("Animal soundzzzzzzzzzz");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }

    void eat() {
        System.out.println("Dog eats");
    }
}


public class MethodOverridingDemo {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.sound();
        Dog d = new Dog();
        d.sounds();

    }
}
