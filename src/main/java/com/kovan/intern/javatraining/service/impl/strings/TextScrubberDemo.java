package com.kovan.intern.javatraining.service.impl.strings;

import org.springframework.stereotype.Service;

@Service
public class TextScrubberDemo {
    public String scrubText(String input) {
        String input_without_numbers = input.replaceAll("\\d+","*");
        String input_without_numbers_punctuations=input_without_numbers.replaceAll("[^a-zA-Z0-9\\s*]+","");
        return input_without_numbers_punctuations;
    }
    
    // Original main method preserved for reference
    // public static void main(String[] args) {
    //     String input = "H3ll0 W0rld! Th1s is J4v4.";
    //     System.out.println(input);
    //     TextScrubberDemo tsd = new TextScrubberDemo();
    //     String result = tsd.scrubText(input);
    //     System.out.println(result);
    // }
}
