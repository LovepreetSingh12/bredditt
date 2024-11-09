package com.n117.breaditt.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.n117.breaditt.repositories.UserRepository;

@RestController
@RequestMapping("/api/health")
public class HealthController {
    
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/mongodb")
    public ResponseEntity<String> checkMongoDbHealth() {
        try {
            // Attempting a simple count operation to check connectivity
            long count = userRepository.count();
            return ResponseEntity.ok("MongoDB is up and running. Total user count: " + count);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("MongoDB is not reachable: " + e.getMessage());
        }
    }
}
