package com.kovan.intern.javatraining.service.impl.recursion;

import org.springframework.stereotype.Service;

@Service
public class RecursiveFibonacci {
    static int[] memo = new int[100];
    public static  int fibonaaciMemo(int n){
        if(n<=1) return n;
        if(memo[n]!=0) return memo[n];
        memo[n]=fibonaaciMemo(n-1)+fibonaaciMemo(n-2);
        return memo[n];
    }

    // Original main method preserved for reference
    // public static void main(String[] args) {
    //     Scanner scanner = new Scanner(System.in);
    //     System.out.println("Enter the Integer to find the fibonacci number ");
    //     int n = scanner.nextInt();
    //     System.out.println("The Answer is "+fibonaaciMemo(n));
    // }
}
