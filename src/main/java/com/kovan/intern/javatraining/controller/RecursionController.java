package com.kovan.intern.javatraining.controller;

import com.kovan.intern.javatraining.dto.*;
import com.kovan.intern.javatraining.service.impl.recursion.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/recursion")
public class RecursionController {

    @Autowired
    private RecursiveFibonacci fibonacciService;
    
    @Autowired
    private Fibonacci simpleFibonacci;
    
    @Autowired
    private RecursivePalindrome palindromeService;
    
    @Autowired
    private PassByValueTest passByValueTest;

    @GetMapping("/fibonacci/{n}")
    public ResponseEntity<FibonacciResponse> calculateFibonacci(@PathVariable int n) {
        int result = RecursiveFibonacci.fibonaaciMemo(n);
        
        FibonacciResponse response = new FibonacciResponse();
        response.setN(n);
        response.setResult(result);
        response.setAlgorithm("Memoized Recursion");
        
        return ResponseEntity.ok(response);
    }
    
    @GetMapping("/fibonacci-simple/{n}")
    public ResponseEntity<FibonacciResponse> calculateSimpleFibonacci(@PathVariable int n) {
        int result = Fibonacci.fibonacci(n);
        
        FibonacciResponse response = new FibonacciResponse();
        response.setN(n);
        response.setResult(result);
        response.setAlgorithm("Simple Recursion");
        
        return ResponseEntity.ok(response);
    }

    @PostMapping("/is-palindrome")
    public ResponseEntity<PalindromeResponse> checkPalindrome(@RequestBody PalindromeRequest request) {
        boolean isPalindrome = RecursivePalindrome.isPalindrome(request.getText());
        
        PalindromeResponse response = new PalindromeResponse();
        response.setText(request.getText());
        response.setPalindrome(isPalindrome);
        
        return ResponseEntity.ok(response);
    }
    
    @GetMapping("/pass-by-value-demo")
    public ResponseEntity<String> passByValueDemo() {
        return ResponseEntity.ok("Pass-by-value demonstration - feature pending");
    }
}
