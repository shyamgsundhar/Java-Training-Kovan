package org.kovan.intern.service.javafundamentals.strings_and_regular_expressions;

public class TextScrubberDemo {
    public static void main(String[] args) {
        String input = "H3ll0 W0rld! Th1s is J4v4.";
        System.out.println(input);
        String input_without_numbers = input.replaceAll("\\d+","*");
        System.out.println(input_without_numbers);
        String input_without_numbers_punctuations=input_without_numbers.replaceAll("[^a-zA-Z0-9\\s*]+","");
        System.out.println(input_without_numbers_punctuations);
    }
}
