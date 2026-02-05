package com.kovan.intern.javatraining.service.impl.strings;

import org.springframework.stereotype.Service;
import java.util.regex.Pattern;

@Service
public class PatternDemo {
    public void demonstrate(){
        System.out.println(Pattern.matches("kovan.*","kovanlabs"));
        System.out.println(Pattern.matches("\\d{4}", "1234"));
        System.out.println(Pattern.matches("\\d{4}", "123"));
        System.out.println(Pattern.matches("[a-z]+", "hello"));
        System.out.println(Pattern.matches("[a-z]+", ""));
        System.out.println(Pattern.matches("a*", "aaaa"));
    }
    
    // Original main method preserved for reference
    // public static void main(String[] args) {
    //     PatternDemo pd = new PatternDemo();
    //     pd.demonstrate();
    // }
}
