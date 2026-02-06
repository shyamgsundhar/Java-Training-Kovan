package org.kovan.intern.service.javafundamentals.strings_and_regular_expressions;

public class RegexReplace {
    public static void main(String[] args) {
        String input = "Kovan123Labs456";
        String result = input.replaceAll("\\d+", "#");
        System.out.println(result);
    }
}
