package com.example.HomeWork.controllers;

import com.example.HomeWork.models.User;
import com.example.HomeWork.servicies.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public String getUsers(Model model){
        model.addAttribute("users", userService.getAllUsers());
        return "users";
    }

    @PostMapping("/users")
    public String addUser(User user, Model model){
        userService.addUser(user);
        model.addAttribute("users", userService.getAllUsers());
        return "users";
    }
}
