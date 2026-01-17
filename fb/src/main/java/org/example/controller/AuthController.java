package org.example.controller;

import org.example.model.User;
import org.example.redis.ActiveUsers;
import org.example.service.AuthService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/fb")
public class AuthController {

    @Autowired
    private AuthService service;

    @Autowired
    private ActiveUsers activeUsers;

    @GetMapping("/signup")
    public String signupPage() {
        return "register";
    }

    @PostMapping("/signup")
    public String signup(@ModelAttribute("user") User user) {
        service.signup(user);
        return "redirect:/fb/login";
    }

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }

    @PostMapping("/login")
    public String login(
            @RequestParam("username") String username,
            @RequestParam("password") String password,
            HttpSession session) {

        User user = service.login(username, password);
        if (user != null) {
            session.setAttribute("user", user);
            //set active user
            activeUsers.addOnlineUser(user.getUsername());
            return "redirect:/dash/dashboard";
        }
        return "login";
    }

    @GetMapping("/logout")
    public String logout(HttpSession session){
        User user = (User) session.getAttribute("user");
        if(user!=null){
            activeUsers.removeOnlineUser(user.getUsername());
        }
        session.invalidate();

        return "redirect:/login";
    }
}
