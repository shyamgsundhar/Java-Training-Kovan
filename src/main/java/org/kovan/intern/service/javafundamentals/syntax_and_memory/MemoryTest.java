package org.kovan.intern.service.javafundamentals.syntax_and_memory;

public class MemoryTest{
    public static void main(String[] args) {
        String s1="Hello";
        String s2="Hello";
        String s3=new String("Hello");
        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s2));
        System.out.println(System.identityHashCode(s3));
        System.out.println(s1==s2);
        System.out.println(s1==s3);
    }
}

