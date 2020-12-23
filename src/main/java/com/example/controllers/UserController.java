package com.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.User;
import com.example.repositories.UserRepository;

@RestController
public class UserController {
    
    @Autowired
    private UserRepository userRepository;
    
    @GetMapping("/test")
    public ResponseEntity<String> createAndSaveUser() {
        User user = new User();
        user.setEmail("prasanna@ibm.com");
        userRepository.save(user);
        return ResponseEntity.ok().body("Success");
    }
}
