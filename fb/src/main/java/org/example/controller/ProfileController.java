package org.example.controller;

import jakarta.servlet.http.HttpSession;
import org.example.model.User;
import org.example.repository.UserRepository;
import org.example.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
public class ProfileController {

    @Autowired
    private ProfileService profileService;

    @GetMapping("/profile")
    public String profile(HttpSession session, Model model) {
        model.addAttribute("user", session.getAttribute("user"));
        return "profile";
    }


    //get all users who are not friends

    @GetMapping("/testusers")
    @ResponseBody
    public List<User> testUsers(){
        return profileService.findAll();
    }
    @GetMapping("/availablefriends")
    @ResponseBody
    public List<User> getAvailableFriends(HttpSession session){

        User user = (User) session.getAttribute("user");

       return profileService.getAvailableUsers(user);

    }
}
