package org.kovan.intern.javafundamentals.strings_and_regular_expressions;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder stringBuilder=new StringBuilder("Helllo");
        System.out.println(System.identityHashCode(stringBuilder));
        stringBuilder.append("Vanakkam");
        System.out.println(stringBuilder.toString());
        System.out.println(System.identityHashCode(stringBuilder));
    }
}
