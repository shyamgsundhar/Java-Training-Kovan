package org.kovan.intern.javafundamentals.syntax_and_memory;

public class OverflowTest{
    public static void main(String[] args) {
        byte bt = 126;
        for(int i=0;i<5;i++){
            System.out.println("value: " + bt);
            bt++;
        }
    }
}