package org.kovan.intern.oops_and_architectural_thinking.inheritance_and_polymorphism;

class Parent{
    int id=50;
}

class Child extends Parent{
    int id=60;
    void display(){
        System.out.println("Here: "+id);
        System.out.println("Parent: "+super.id);
    }
}

public class SuperClassDemo {
    public static void main(String[] args) {
        Child child=new Child();
        child.display();
    }
}
