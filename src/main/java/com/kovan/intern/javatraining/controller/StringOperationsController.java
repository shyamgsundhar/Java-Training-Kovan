package com.kovan.intern.javatraining.controller;

import com.kovan.intern.javatraining.dto.EmailValidationResponse;
import com.kovan.intern.javatraining.service.impl.strings.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/strings")
public class StringOperationsController {

    @Autowired
    private EmailValidator emailValidator;
    
    @Autowired
    private TextScrubberDemo textScrubber;
    
    @Autowired
    private RegexReplace regexReplace;
    
    @Autowired
    private StringDemo stringDemo;
    
    @Autowired
    private StringBuilderDemo stringBuilderDemo;
    
    @Autowired
    private PatternDemo patternDemo;
    
    @Autowired
    private MatcherDemo matcherDemo;

    @PostMapping("/validate-email")
    public ResponseEntity<EmailValidationResponse> validateEmail(@RequestParam String email) {
        boolean isValid = emailValidator.validate(email);
        
        EmailValidationResponse response = new EmailValidationResponse();
        response.setEmail(email);
        response.setValid(isValid);
        response.setMessage(isValid ? "Valid email" : "Invalid email format");
        
        return ResponseEntity.ok(response);
    }

    @PostMapping("/scrub-text")
    public ResponseEntity<String> scrubText(@RequestBody String input) {
        String scrubbed = textScrubber.scrubText(input);
        return ResponseEntity.ok(scrubbed);
    }
    
    @PostMapping("/regex-replace")
    public ResponseEntity<String> regexReplaceNumbers(@RequestBody String input) {
        String replaced = regexReplace.replace(input);
        return ResponseEntity.ok(replaced);
    }
    
    @GetMapping("/string-demo")
    public ResponseEntity<String> stringImmutabilityDemo() {
        stringDemo.demonstrate();
        return ResponseEntity.ok("Check console for string immutability demonstration");
    }
    
    @GetMapping("/stringbuilder-demo")
    public ResponseEntity<String> stringBuilderMutabilityDemo() {
        stringBuilderDemo.demonstrate();
        return ResponseEntity.ok("Check console for StringBuilder mutability demonstration");
    }
    
    @GetMapping("/pattern-demo")
    public ResponseEntity<String> patternMatchingDemo() {
        patternDemo.demonstrate();
        return ResponseEntity.ok("Check console for pattern matching demonstration");
    }
    
    @GetMapping("/matcher-demo")
    public ResponseEntity<String> matcherFindDemo() {
        matcherDemo.demonstrate();
        return ResponseEntity.ok("Check console for matcher demonstration");
    }
    
    @GetMapping("/email-validation-demo")
    public ResponseEntity<String> emailValidationDemo() {
        emailValidator.demonstrateValidation();
        return ResponseEntity.ok("Check console for email validation demonstration");
    }
}
