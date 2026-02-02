package org.kovan.intern.oops_and_architectural_thinking;

class StaticContextTest {
    int id;
    static String name = "Hello";
}
public class StaticContextDemo{
    public static void main(String[] args) {
        System.out.println(StaticContextTest.name);
        StaticContextTest staticContextTest = new StaticContextTest();
        System.out.println(staticContextTest.id);
    }
}

