package org.example.controller;

import org.example.model.FriendShipRequestDTO;
import org.example.model.Post;
import org.example.model.User;
import org.example.service.FeedService;
import org.example.service.PostService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/feed")
public class FeedController {

    @Autowired
    private FeedService feedService;


    @GetMapping("/friendrequests")
    public List<FriendShipRequestDTO> friendRequests(HttpSession session){

      User user = (User)  session.getAttribute("user");
      return feedService.friendRequests(user);

    }



}
