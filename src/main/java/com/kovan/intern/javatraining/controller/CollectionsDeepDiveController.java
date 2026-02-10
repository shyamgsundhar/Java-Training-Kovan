package com.kovan.intern.javatraining.controller;

import com.kovan.intern.javatraining.dto.ListPerformanceResponse;
import com.kovan.intern.javatraining.service.impl.collections.ListPerformanceTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/collections")
public class CollectionsDeepDiveController {

    @Autowired
    private ListPerformanceTestService listPerformanceTestService;

    @GetMapping("/list-performance")
    public ResponseEntity<ListPerformanceResponse> listPerformance(
            @RequestParam(defaultValue = "1000000") int size) {
        ListPerformanceResponse response = listPerformanceTestService.runTest(size);
        return ResponseEntity.ok(response);
    }
}
