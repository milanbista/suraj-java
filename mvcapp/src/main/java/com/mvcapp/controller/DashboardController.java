package com.mvcapp.controller;

import com.mvcapp.model.User;
import com.mvcapp.service.Dashboardservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

@Controller
public class DashboardController {

    @Autowired
    private Dashboardservice dashboardservice;

    @GetMapping("/dashboard")
    public String dashboard(HttpSession session, Model model){

      String username = (String) session.getAttribute("username");

      User user =  dashboardservice.dashboard(username);

      model.addAttribute("user", user);

      return "dashboard";
    }

}
