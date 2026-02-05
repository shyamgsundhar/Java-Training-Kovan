package com.kovan.intern.javatraining.dto;

public class PalindromeResponse {
    private String text;
    private boolean isPalindrome;
    
    public String getText() { return text; }
    public void setText(String text) { this.text = text; }
    
    public boolean isPalindrome() { return isPalindrome; }
    public void setPalindrome(boolean palindrome) { isPalindrome = palindrome; }
}
