package com.kovan.intern.javatraining.service.impl.strings;

import org.springframework.stereotype.Service;
import java.util.regex.Pattern;

@Service
public class EmailValidator {

    public boolean validate(String email) {
        String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z]{2,}$";
        return Pattern.matches(regex, email);
    }

    public void demonstrateValidation() {
        String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z]{2,}$";
        //start + username + @ + mail service + . + domain + end

        String[] mails = {
                "test@gmail.com",
                "user.name@yahoo.in",
                "kovanlabs@gmail.com",
                "user@@gmail.com",
            "user name@gmail.com",
                "user#gmail.com",
                "user@domain,com",
                "hello.world@site.net",
                "mail123@college.edu",
                "dev-team@startup.io",
                "user99@service.in",
                "john_doe123@company.org",
                "admin@domain.co",
                "user@.com",
                "@gmail.com",
                "user@gmail",
                "user@domain.c",
                "user@domain..com",
                "abc_xyz@mydomain.com",
                "testgmail.com",
        };
        for (String email : mails) {
            System.out.println(email + " = " + Pattern.matches(regex, email));
        }
    }
    
    // Original main method preserved for reference
    // public static void main(String[] args) {
    //     EmailValidator ev = new EmailValidator();
    //     ev.demonstrateValidation();
    // }
}
