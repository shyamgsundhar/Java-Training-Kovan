package org.kovan.intern.service.javafundamentals.strings_and_regular_expressions;

import java.util.regex.Pattern;

public class EmailValidator {

        public static void main(String[] args) {

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
    }
