package com.mvcapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class LoginController {

    @Autowired
    private DummyDB db;

   @GetMapping("/user")
   @ResponseBody
   public String user(@RequestParam String username, @RequestParam String password){

       return "hello " + username+ " " + password;
   }

   @GetMapping("/user/{id}/name/{name}")
   @ResponseBody
   public String users(@PathVariable String id, @PathVariable String name){
       return "hello user with id " + id + " " + name;
   }





}
