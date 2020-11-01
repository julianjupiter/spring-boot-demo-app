package com.example.demo.ui.controller;

import com.example.demo.ui.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user-list")
    public String listUsers(Model model) {
        model.addAttribute("users", userService.findAll());

        return "user/list";
    }

    @GetMapping("/user/view/{id}")
    public String viewUser(@PathVariable long id, Model model) {
        userService.findById(id)
                .ifPresent(user -> model.addAttribute("user", user));

        return "user/view";
    }
}
