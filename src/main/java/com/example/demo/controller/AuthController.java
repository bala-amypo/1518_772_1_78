package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private UserService userService;

    // REGISTER
    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return userService.createuser(user);
    }

    // LOGIN
    @PostMapping("/login")
    public String login(@RequestBody User user) {
        List<User> users = userService.getallusers();

        for (User u : users) {
            if (u.getEmail().equals(user.getEmail()) && u.getPassword().equals(user.getPassword())) {
                return "Login successful for user: " + u.getName();
            }
        }

        return "Invalid email or password";
    }

    // OPTIONAL: Get all users (for testing)
    @GetMapping("/all")
    public List<User> getAllUsers() {
        return userService.getallusers();
    }
}
