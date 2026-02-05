package com.kovan.intern.javatraining.controller;

import com.kovan.intern.javatraining.service.impl.inheritance.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/inheritance")
public class InheritanceController {

    @Autowired
    private SuperClassDemo superClassDemo;
    
    @Autowired
    private ShapeFactoryDemo shapeFactoryDemo;
    
    @Autowired
    private ImmutableClassDemo immutableClassDemo;
    
    @Autowired
    private MethodOverridingDemo methodOverridingDemo;
    
    @Autowired
    private CovariantReturnTypesDemo covariantReturnTypesDemo;

    @GetMapping("/super-demo")
    public ResponseEntity<String> superClassDemonstration() {
        superClassDemo.demonstrate();
        return ResponseEntity.ok("Check console for super class demonstration");
    }
    
    @GetMapping("/shape-factory")
    public ResponseEntity<String> shapeFactoryDemonstration() {
        shapeFactoryDemo.demonstrate();
        return ResponseEntity.ok("Check console for polymorphism (shape factory) demonstration");
    }
    
    @GetMapping("/immutable-demo")
    public ResponseEntity<String> immutableClassDemonstration() {
        immutableClassDemo.demonstrate();
        return ResponseEntity.ok("Check console for immutable class demonstration");
    }
    
    @GetMapping("/method-overriding")
    public ResponseEntity<String> methodOverridingDemonstration() {
        methodOverridingDemo.demonstrate();
        return ResponseEntity.ok("Check console for method overriding demonstration");
    }
    
    @GetMapping("/covariant-return")
    public ResponseEntity<String> covariantReturnDemonstration() {
        covariantReturnTypesDemo.demonstrate();
        return ResponseEntity.ok("Check console for covariant return types demonstration");
    }
}
