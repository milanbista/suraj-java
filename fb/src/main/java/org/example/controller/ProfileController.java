package org.example.controller;

import jakarta.servlet.http.HttpSession;
import org.example.model.FriendDTO;
import org.example.model.User;
import org.example.repository.UserRepository;
import org.example.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

//    @GetMapping("/testusers")
//    @ResponseBody
//    public List<User> testUsers(){
//        return profileService.findAll();
//    }
    @GetMapping("/availablefriends")
    @ResponseBody
    public List<User> getAvailableFriends(HttpSession session){

        User user = (User) session.getAttribute("user");

       return profileService.getAvailableUsers(user);

    }

    @GetMapping("/profile/update")
    public String showUpdateProfile(HttpSession session, Model model) {
        User user = (User) session.getAttribute("user");
        model.addAttribute("user", user);
        return "update-profile";
    }

    @PostMapping("/profile/update")
    public String updateProfile(
            @ModelAttribute("user") User formUser, HttpSession session){
        User loogedInUser = (User) session.getAttribute("user");
        User updatedUser = profileService.updateProfile(loogedInUser,formUser);
        if(updatedUser!=null){
            session.setAttribute("user",updatedUser);
        }
        return "redirect:/profile";
    }

    @PostMapping("/addfriend")
    @ResponseBody
    public String addFriend(@RequestBody FriendDTO friendDTO, HttpSession session){

        //who is sending request  User
        User user = (User) session.getAttribute("user");

        //whom you are sending the request to User
        return profileService.addFriend(user, friendDTO.getUsername());


    }
}
