package com.studygroup.controller;

import com.studygroup.entity.User;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private Map<String, User> userRepo = new HashMap<>();

    @PostMapping("/register")
    public String register(@RequestBody User user) {
        userRepo.put(user.getUsername(), user);
        return "User registered";
    }

    @PostMapping("/login")
    public String login(@RequestBody User login) {
        User user = userRepo.get(login.getUsername());
        if (user != null && user.getPassword().equals(login.getPassword())) {
            return "Login successful";
        }
        return "Invalid credentials";
    }
}
