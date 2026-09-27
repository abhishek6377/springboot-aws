package com.springaws.controller;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class WelcomeController {

    @GetMapping("/welcome")
    public ResponseEntity<String> welcome() {
        return ResponseEntity.ok("Welcome to Spring Boot Application");
    }

    @GetMapping("/health")
    public ResponseEntity<String> health() {
        return ResponseEntity.ok("Application is UP");
    }

    @GetMapping("/time")
    public ResponseEntity<String> time() {
        return ResponseEntity.ok(LocalDateTime.now().toString());
    }

    @GetMapping("/user")
    public ResponseEntity<Map<String, Object>> user() {
        Map<String, Object> response = new HashMap<>();
        response.put("id", 101);
        response.put("name", "Abhishek Gupta");
        response.put("company", "EY");
        response.put("experience", "4.5 Years");
        return ResponseEntity.ok(response);
    }

    @GetMapping("/employee/{id}")
    public ResponseEntity<String> employee(
            @PathVariable Long id) {

        return ResponseEntity.ok("Employee Id : " + id);
    }

    @GetMapping("/search")
    public ResponseEntity<String> search(
            @RequestParam String name) {
        return ResponseEntity.ok("Searching Employee : " + name);
    }
}
