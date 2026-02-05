package com.kovan.intern.javatraining.controller;

import com.kovan.intern.javatraining.service.impl.composition.*;
import com.kovan.intern.javatraining.service.impl.interfaces.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/advanced")
public class AdvancedConceptsController {

    @Autowired
    private CarEngineComposition carEngineComposition;
    
    @Autowired
    private PCBuilderDemo pcBuilderDemo;
    
    @Autowired
    private CarInterfaceDemo carInterfaceDemo;
    
    @Autowired
    private DefaultCarInterfaceDemo defaultCarInterfaceDemo;
    
    @Autowired
    private FunctionalInterfaceDemo functionalInterfaceDemo;
    
    @Autowired
    private PluginSystemDemo pluginSystemDemo;
    
    @Autowired
    private SmartPhoneMultipleInterfaceDemo smartPhoneDemo;
    
    @Autowired
    private TypesOfFunctionalInterface typesOfFunctionalInterface;

    @GetMapping("/composition/car-engine")
    public ResponseEntity<String> carEngineCompositionDemo() {
        carEngineComposition.demonstrate();
        return ResponseEntity.ok("Check console for composition over inheritance (car engine) demonstration");
    }
    
    @GetMapping("/composition/pc-builder")
    public ResponseEntity<String> pcBuilderDemonstration() {
        pcBuilderDemo.demonstrate();
        return ResponseEntity.ok("Check console for PC builder composition demonstration");
    }
    
    @GetMapping("/interfaces/car-demo")
    public ResponseEntity<String> carInterfaceDemonstration() {
        carInterfaceDemo.demonstrate();
        return ResponseEntity.ok("Check console for interface demonstration");
    }
    
    @GetMapping("/interfaces/default-methods")
    public ResponseEntity<String> defaultMethodsDemonstration() {
        defaultCarInterfaceDemo.demonstrate();
        return ResponseEntity.ok("Check console for default interface methods demonstration");
    }
    
    @GetMapping("/functional-interface/{value}")
    public ResponseEntity<Integer> functionalInterfaceCalculation(@PathVariable int value) {
        int result = functionalInterfaceDemo.calculateSquare(value);
        return ResponseEntity.ok(result);
    }
    
    @GetMapping("/plugin-system")
    public ResponseEntity<String> pluginSystemDemonstration() {
        pluginSystemDemo.demonstrate();
        return ResponseEntity.ok("Check console for plugin system demonstration");
    }
    
    @GetMapping("/multiple-interfaces")
    public ResponseEntity<String> multipleInterfacesDemonstration() {
        smartPhoneDemo.demonstrate();
        return ResponseEntity.ok("Check console for multiple interfaces demonstration");
    }
    
    @GetMapping("/functional-types")
    public ResponseEntity<String> functionalTypesDemonstration() {
        typesOfFunctionalInterface.demonstrate();
        return ResponseEntity.ok("Check console for functional interface types demonstration");
    }
}
