package com.mvcapp.controller;

import com.mvcapp.model.User;
import com.mvcapp.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AuthController {

    @Autowired
    private AuthService authService;

    @GetMapping("/signup")
    public String register(){
        return "register";
    }

    @PostMapping("/signup")
    public String login(@ModelAttribute("user") User user){

        authService.signup(user);

        return "redirect://login";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }
}
