package com.kovan.intern.javatraining.controller;

import com.kovan.intern.javatraining.dto.*;
import com.kovan.intern.javatraining.service.impl.arrays.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/arrays")
public class ArrayOperationsController {

    @Autowired
    private MatrixMultiply matrixMultiply;
    
    @Autowired
    private SpiralMatrix spiralMatrix;
    
    @Autowired
    private JaggedArrays jaggedArrays;
    
    @Autowired
    private ArrayClone arrayClone;
    
    @Autowired
    private SystemArrayCopy systemArrayCopy;
    
    @Autowired
    private VarArgsDemo varArgsDemo;

    @PostMapping("/matrix-multiply")
    public ResponseEntity<MatrixMultiplyResponse> multiplyMatrices(@RequestBody MatrixMultiplyRequest request) {
        int[][] result = matrixMultiply.multiply(request.getMatrixA(), request.getMatrixB());
        
        MatrixMultiplyResponse response = new MatrixMultiplyResponse();
        response.setResultMatrix(result);
        response.setMessage("Matrix multiplication successful");
        
        return ResponseEntity.ok(response);
    }

    @GetMapping("/spiral-matrix/{size}")
    public ResponseEntity<SpiralMatrixResponse> generateSpiralMatrix(@PathVariable int size) {
        int[][] spiral = spiralMatrix.generateSpiral(size);
        
        SpiralMatrixResponse response = new SpiralMatrixResponse();
        response.setSpiralMatrix(spiral);
        response.setSize(size);
        
        return ResponseEntity.ok(response);
    }

    @GetMapping("/jagged-demo")
    public ResponseEntity<String> jaggedArrayDemo() {
        jaggedArrays.demonstrate();
        return ResponseEntity.ok("Check console for jagged array demonstration");
    }
    
    @GetMapping("/clone-demo")
    public ResponseEntity<String> arrayCloneDemo() {
        arrayClone.demonstrate();
        return ResponseEntity.ok("Check console for array clone demonstration");
    }
    
    @GetMapping("/system-copy-demo")
    public ResponseEntity<String> systemCopyDemo() {
        systemArrayCopy.demonstrate();
        return ResponseEntity.ok("Check console for System.arraycopy demonstration");
    }
    
    @GetMapping("/varargs/{values}")
    public ResponseEntity<Integer> varArgsSum(@PathVariable int... values) {
        int sum = VarArgsDemo.sumOfAll(values);
        return ResponseEntity.ok(sum);
    }
}
