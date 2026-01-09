package com.pentasoftsolutions.controller;

import com.pentasoftsolutions.model.Post;
import com.pentasoftsolutions.model.User;
import com.pentasoftsolutions.redis.ActiveUsers;
import com.pentasoftsolutions.service.AuthService;
import com.pentasoftsolutions.service.PostService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
public class DashboardController {

    @Autowired
    private final PostService postService;

    @Autowired
    private AuthService authService;

    @Autowired
    private ActiveUsers activeUsers;

    public DashboardController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/dashboard")
    public String dashboard(Model model, HttpSession session) {

        User loggedInUser = (User) session.getAttribute("user");
        if (loggedInUser == null) return "redirect:/login";

        User user = authService.getUser(loggedInUser.getUsername());
        List<Post> posts =  user.getPosts();
        model.addAttribute("user", user);
        model.addAttribute("posts", posts);
        model.addAttribute("activeUsers", activeUsers.getOnlineUsers());

//        model.addAttribute("posts", postService.getAll());
        return "dashboard";
    }


    @GetMapping("/post")
    public String getPostContent(){
        return "post";
    }

    @PostMapping("/post")
    public String post(@RequestParam String content, HttpSession session) {

        User user = (User) session.getAttribute("user");
        Post post = new Post();
        post.setContent(content);
        post.setUsername(user.getUsername());
        post.setUser(user);
        postService.save(post);

        return "redirect:/dashboard";
    }



}
