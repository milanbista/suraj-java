package com.mvcapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;
import java.util.Arrays;
import java.util.List;

@Controller
public class DashboardController {

    @GetMapping("/dashboard")
    public String dash(HttpSession session, Model model){
//       Object user =  session.getAttribute("username");
//       if(user == null){
//           return "login";
//       }
//
//        List<String> products = Arrays.asList("apple", "banana", "orange", "grapes");
//
//        model.addAttribute("products", products );

        return "dashboard";
    }

}
