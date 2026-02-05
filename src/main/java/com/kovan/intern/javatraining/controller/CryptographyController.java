package com.kovan.intern.javatraining.controller;

import com.kovan.intern.javatraining.dto.*;
import com.kovan.intern.javatraining.service.impl.cryptography.Enigma;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/crypto")
public class CryptographyController {

    @Autowired
    private Enigma enigmaService;

    @PostMapping("/encrypt")
    public ResponseEntity<EnigmaResponse> encrypt(@RequestBody EnigmaRequest request) {
        String encrypted = Enigma.encrypt(request.getMessage(), request.getKey());
        
        EnigmaResponse response = new EnigmaResponse();
        response.setResult(encrypted);
        response.setOperation("ENCRYPT");
        
        return ResponseEntity.ok(response);
    }

    @PostMapping("/decrypt")
    public ResponseEntity<EnigmaResponse> decrypt(@RequestBody EnigmaRequest request) {
        String decrypted = Enigma.decrypt(request.getMessage(), request.getKey());
        
        EnigmaResponse response = new EnigmaResponse();
        response.setResult(decrypted);
        response.setOperation("DECRYPT");
        
        return ResponseEntity.ok(response);
    }
}
