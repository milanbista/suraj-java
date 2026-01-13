package com.suraj.controller;

import com.suraj.model.Post;
import com.suraj.model.User;
import com.suraj.service.PostService;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class DashboardController {

    private final PostService postService;

    public DashboardController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/dashboard")
    public String dashboard(Model model, HttpSession session) {

        User user = (User) session.getAttribute("user");
        if (user == null) return "redirect:/login";

        model.addAttribute("user", user);
        model.addAttribute("posts", postService.getAll());
        return "dashboard";
    }

    @PostMapping("/post")
    public String post(@RequestParam String content, HttpSession session) {

        User user = (User) session.getAttribute("user");
        Post post = new Post();
        post.setContent(content);
        post.setUsername(user.getUsername());
        postService.save(post);

        return "redirect:/dashboard";
    }
}
