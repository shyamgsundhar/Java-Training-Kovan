package org.kovan.intern.oops_and_architectural_thinking.interfaces_and_abstract_classes;

abstract class Parent{
    Parent(){
        System.out.println("Parent Class Activated");
    }
}
class Child extends Parent{
    Child(){
        System.out.println("Child Class Activated");
    }
}
public class AbstractConstructor {
    public static void main(String[] args) {
        Child child = new Child();
    }
}
