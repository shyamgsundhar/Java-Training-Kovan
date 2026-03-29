package org.kovan.intern.service.javafundamentals.strings_and_regular_expressions;

public class StringDemo {
    public static void main(String[] args) {
        String st="Hello";
        System.out.println(System.identityHashCode(st));
        st=st+"Vanakkam";
        System.out.println(st);
        System.out.println(System.identityHashCode(st));
    }
}
