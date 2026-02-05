package com.kovan.intern.javatraining.service.impl.recursion;

import org.springframework.stereotype.Service;

@Service
public class RecursivePalindrome {
    public static boolean isPalindrome(String s){
        if(s==null || s.length()<=1) return true;
        if(s.charAt(0)!=s.charAt(s.length()-1)) return false;
        return isPalindrome(s.substring(1,s.length()-1));
    }
    
    // Original main method preserved for reference
    // public static void main(String[] args) {
    //     System.out.println(isPalindrome("banana"));
    //     System.out.println(isPalindrome("madam"));
    // }
}
