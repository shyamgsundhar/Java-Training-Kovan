package org.kovan.intern.service.javafundamentals.strings_and_regular_expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherDemo {
    public static void main(String[] args) {
        String input = "Kovan123";
        String phone = "1234567890";
        Pattern p = Pattern.compile("\\d+");
        Pattern ph = Pattern.compile(("\\d{10}"));
        Matcher m = p.matcher(input);
        Matcher ph_matcher=ph.matcher(phone);
        if (m.find()) {
            System.out.println("found");
        }
        if (ph_matcher.find()) {
            System.out.println("10 numbers found");
        }
    }
}
