package com.example.GlobalJava.controller;

import com.example.GlobalJava.model.User;
import com.example.GlobalJava.repository.UserRepository;
import com.example.GlobalJava.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserControoller {

    @Autowired
    private UserService userService;

    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @GetMapping
    public List<User> getUsers() {
        return userService.getAllUsers();
    }

    /*private UserRepository userRepository;

    // Endpoint para crear un nuevo usuario
    @PostMapping
    public User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }*/
}
