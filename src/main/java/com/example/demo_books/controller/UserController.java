package com.example.demo_books.controller;

import com.example.demo_books.entity.User;
import com.example.demo_books.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping
    public List<User> getAllUsers() {
        return userService.getUsers();
    }

    @PostMapping
    public void addUser(@RequestBody User user){
        userService.addNewUser(user);
    }
}
