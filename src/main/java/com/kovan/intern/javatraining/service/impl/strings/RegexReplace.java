package com.kovan.intern.javatraining.service.impl.strings;

import org.springframework.stereotype.Service;

@Service
public class RegexReplace {
    public String replace(String input) {
        return input.replaceAll("\\d+", "#");
    }
    
    // Original main method preserved for reference
    // public static void main(String[] args) {
    //     String input = "Kovan123Labs456";
    //     RegexReplace rr = new RegexReplace();
    //     String result = rr.replace(input);
    //     System.out.println(result);
    // }
}
