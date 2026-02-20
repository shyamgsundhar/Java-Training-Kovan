package org.kovan.intern.oops_and_architectural_thinking.interfaces_and_abstract_classes;

interface A{
    void show();
}
class TestA implements A{
    public void show(){
        System.out.println("Show from A");
    }
    public void display(){
        System.out.println("Display from A");
    }
}
public class InterfaceReferenceTrapDemo {
    public static void main(String[] args) {
        A a = new TestA();
        a.show();
    }
}
