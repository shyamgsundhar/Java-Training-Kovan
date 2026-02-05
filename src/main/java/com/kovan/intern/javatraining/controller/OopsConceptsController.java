package com.kovan.intern.javatraining.controller;

import com.kovan.intern.javatraining.service.impl.oops.*;
import com.kovan.intern.javatraining.service.impl.memory.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/oops")
public class OopsConceptsController {

    @Autowired
    private AppConfigTest appConfigService;
    
    @Autowired
    private InstanceControlDemo instanceControlService;
    
    @Autowired
    private ObjectCounterDemo objectCounterDemo;
    
    @Autowired
    private StaticContextDemo staticContextDemo;
    
    @Autowired
    private MemoryTest memoryTest;
    
    @Autowired
    private OverflowTest overflowTest;

    @GetMapping("/singleton-demo")
    public ResponseEntity<String> singletonDemo() {
        appConfigService.demonstrate();
        return ResponseEntity.ok("Check console for Singleton pattern demonstration");
    }

    @GetMapping("/instance-control")
    public ResponseEntity<String> instanceControlDemo() {
        instanceControlService.demonstrate();
        return ResponseEntity.ok("Check console for instance control demonstration");
    }
    
    @GetMapping("/object-counter")
    public ResponseEntity<String> objectCounterDemonstration() {
        objectCounterDemo.demonstrate();
        return ResponseEntity.ok("Check console for object counter demonstration");
    }
    
    @GetMapping("/static-context")
    public ResponseEntity<String> staticContextDemonstration() {
        staticContextDemo.demonstrate();
        return ResponseEntity.ok("Check console for static context demonstration");
    }
    
    @GetMapping("/memory-test")
    public ResponseEntity<String> memoryTestDemonstration() {
        memoryTest.demonstrate();
        return ResponseEntity.ok("Check console for memory test (String pool) demonstration");
    }
    
    @GetMapping("/overflow-test")
    public ResponseEntity<String> overflowTestDemonstration() {
        overflowTest.demonstrate();
        return ResponseEntity.ok("Check console for overflow test demonstration");
    }
}
