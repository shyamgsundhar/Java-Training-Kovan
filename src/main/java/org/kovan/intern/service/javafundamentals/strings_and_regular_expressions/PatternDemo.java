package org.kovan.intern.service.javafundamentals.strings_and_regular_expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternDemo {
    public static void main(String[] args) {
        System.out.println(Pattern.matches("kovan.*","kovanlabs"));
        System.out.println(Pattern.matches("\\d{4}", "1234"));
        System.out.println(Pattern.matches("\\d{4}", "123"));
        System.out.println(Pattern.matches("[a-z]+", "hello"));
        System.out.println(Pattern.matches("[a-z]+", ""));
        System.out.println(Pattern.matches("a*", "aaaa"));
    }
}
