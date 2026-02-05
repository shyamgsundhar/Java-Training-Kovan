package com.kovan.intern.javatraining.controller;

import com.kovan.intern.javatraining.dto.PrimeResponse;
import com.kovan.intern.javatraining.service.impl.patterns.*;
import com.kovan.intern.javatraining.service.impl.controlflow.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/patterns")
public class PatternController {

    @Autowired
    private AlphabetPattern alphabetPattern;
    
    @Autowired
    private BlueJPattern blueJPattern;
    
    @Autowired
    private PerfectDiamond perfectDiamond;
    
    @Autowired
    private PrimeSieve primeSieve;
    
    @Autowired
    private SwitchPractice switchPractice;
    
    @Autowired
    private TernaryOperator ternaryOperator;

    @GetMapping("/alphabet/{rows}")
    public ResponseEntity<String> generateAlphabetPattern(@PathVariable int rows) {
        alphabetPattern.generate(rows);
        return ResponseEntity.ok("Check console for alphabet pattern");
    }
    
    @GetMapping("/bluej/{text}")
    public ResponseEntity<String> generateBlueJPattern(@PathVariable String text) {
        blueJPattern.generate(text);
        return ResponseEntity.ok("Check console for BlueJ pattern");
    }
    
    @GetMapping("/diamond/{size}")
    public ResponseEntity<String> generateDiamond(@PathVariable int size) {
        perfectDiamond.generate(size);
        return ResponseEntity.ok("Check console for diamond pattern");
    }
    
    @GetMapping("/primes/{limit}")
    public ResponseEntity<PrimeResponse> generatePrimes(@PathVariable int limit) {
        int[] primes = primeSieve.generatePrimes(limit);
        
        PrimeResponse response = new PrimeResponse();
        response.setLimit(limit);
        response.setPrimes(primes);
        
        return ResponseEntity.ok(response);
    }
    
    @GetMapping("/switch/{num}")
    public ResponseEntity<String> executeSwitchCase(@PathVariable int num) {
        String result = switchPractice.execute(num);
        return ResponseEntity.ok(result);
    }
    
    @GetMapping("/ternary/{a}/{b}")
    public ResponseEntity<String> compareTernary(@PathVariable int a, @PathVariable int b) {
        String result = ternaryOperator.compare(a, b);
        return ResponseEntity.ok(result);
    }
}
