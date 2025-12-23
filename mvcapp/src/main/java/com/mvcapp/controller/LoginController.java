package com.mvcapp.controller;

import com.mvcapp.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    @Autowired
    private LoginService loginService;

    @GetMapping("/login")
    public String getLogin(){
        return "login";
    }

    @PostMapping("/login")
    public String postLogin(@RequestParam String username, @RequestParam String password, HttpSession session){

      boolean isValid =    loginService.login(username, password);
      if(isValid){
          session.setAttribute("username", username );
          return  "redirect://dashboard";
      }

      return "login";
    }
}
