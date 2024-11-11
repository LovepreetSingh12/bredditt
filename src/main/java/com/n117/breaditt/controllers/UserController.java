package com.n117.breaditt.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.n117.breaditt.models.UserModel;
import com.n117.breaditt.services.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private final UserService userService;

    UserController(UserService userService) {
        this.userService = userService;
    }

    // Fetching all Users
    @GetMapping("/all")
    public List<UserModel> getAllUsers() {
        return userService.getAllUsers();
    }

    // Saving a new User
    @PostMapping("/create")
    public UserModel saveUser(@RequestBody UserModel user) {
        return userService.createUser(user);
    }
}
