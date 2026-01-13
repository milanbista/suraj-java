package com.project2.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {

//    @Autowired
//    UserDAO db;

    @GetMapping("/suraj")
    public String home() {
        System.out.println("Enter Homepage");
        return "index";
    }

    @PostMapping("/login")
    public String login(@RequestParam String username,
                        @RequestParam String password,
                        HttpSession session,
                        Model model) {
//
//        if(db.validate(username, password)) {
//            session.setAttribute("user", username);
//            return "redirect:/dashboard";
//        }

        model.addAttribute("error", "Invalid Username / Password!");
        return "index";
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/";
    }
}
