package org.kovan.intern.oops_and_architectural_thinking.interfaces_and_abstract_classes;

abstract class Test {
    static {
        System.out.println("Static block");
    }
}

class Demo extends Test {}

public class AbstractStaticBlock {
    public static void main(String[] args) {
        new Demo();
    }
}
