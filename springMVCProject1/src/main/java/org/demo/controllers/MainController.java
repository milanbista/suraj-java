package org.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @GetMapping("/plain-text")
    @ResponseBody
    public String plainText(){
        return "This is plain text";
    }

    @GetMapping("/home")
    public String home(){
        return "/WEB-INF/views/home.jsp";
    }
}
