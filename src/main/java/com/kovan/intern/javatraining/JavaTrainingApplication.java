package com.kovan.intern.javatraining;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaTrainingApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaTrainingApplication.class, args);
        System.out.println("╔══════════════════════════════════════════════════════╗");
        System.out.println("║  Java Training Spring Boot Application Started!     ║");
        System.out.println("║  API Base URL: http://localhost:8080/api            ║");
        System.out.println("║  All existing logic preserved without modification  ║");
        System.out.println("╚══════════════════════════════════════════════════════╝");
    }
}
