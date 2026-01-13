package com.project2.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {

    @GetMapping("/dashboard")
    public String dashboard(HttpSession session, Model model) {

        String user = (String) session.getAttribute("user");

        if(user == null)
            return "redirect:/";

        model.addAttribute("loggedUser", user);

        return "dashboard";
    }
}
