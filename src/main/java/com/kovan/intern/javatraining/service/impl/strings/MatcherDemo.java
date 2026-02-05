package com.kovan.intern.javatraining.service.impl.strings;

import org.springframework.stereotype.Service;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class MatcherDemo {
    public void demonstrate(){
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
    
    // Original main method preserved for reference
    // public static void main(String[] args) {
    //     MatcherDemo md = new MatcherDemo();
    //     md.demonstrate();
    // }
}
