package org.kovan.intern.javafundamentals.methods_and_recursion;

import java.util.Scanner;

public class Fibonacci {
    public static int fibonacci(int n){
        if(n<=1) return n;
        return fibonacci(n-1)+fibonacci(n-2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number ");
        int n=scanner.nextInt();
        System.out.println("The Result is "+fibonacci(n));
    }
}
