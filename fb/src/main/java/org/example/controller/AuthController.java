package org.example.controller;

import jakarta.servlet.http.HttpSession;
import org.example.model.User;
import org.example.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/fb")
public class AuthController {

    @Autowired
    private AuthService authService;

    @GetMapping("/signup")
    public String signupPage(){
        return  "register";
    }

    @PostMapping("/signup")
    public String signup(@ModelAttribute("user")User user){
        authService.signup(user);
        return "redirect:/fb/login";
    }

    @GetMapping("/login")
    public String loginPage(){
        return "login";
    }

    @PostMapping("/login")
    public String login(
            @RequestParam("username") String username,
            @RequestParam("password") String password,
            HttpSession session){
        User user = authService.authenticateUser(username,password);
        if (user!=null){
            authService.setUserOnline(user,session);
            return "redirect:/dash/dashboard";
        }
        return "login";
    }

    @GetMapping("/logout")
    public String logout(HttpSession session){
        authService.logoutUser(session);
        return "redirect:/fb/login";
    }
}


