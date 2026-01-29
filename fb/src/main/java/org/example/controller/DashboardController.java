package org.example.controller;

import org.example.model.Post;
import org.example.model.User;
import org.example.redis.ActiveUsers;
import org.example.service.AuthService;
import org.example.service.FriendService;
import org.example.service.PostService;
import org.example.service.StoryService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;


@Controller
@RequestMapping("/dash")
public class DashboardController {

    @Autowired
    private final PostService postService;

    @Autowired
    private StoryService storyService;

    @Autowired
    private AuthService authService;

    @Autowired
    private ActiveUsers activeUsers;

    @Autowired
    private FriendService friendService;

    public DashboardController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/dashboard")
    public String dashboard(Model model, HttpSession session) {

        User loggedInUser = (User) session.getAttribute("user");
        if (loggedInUser == null) return "redirect:/login";


        User user = authService.getUser(loggedInUser.getUsername());
        List<User> acceptedFriends = friendService.getAcceptedFriends(user);


        List<String> onlineUsernames = activeUsers.getOnlineUsers();
        List<User> activeFriends = acceptedFriends.stream()
                .filter(f->onlineUsernames.contains(f.getUsername()))
                .collect(Collectors.toList());


        List<String> friendUsernames=acceptedFriends.stream()
                        .map(User::getUsername)
                .collect(Collectors.toList());
        friendUsernames.add(user.getUsername());

        List<Post> posts = postService.getPostsByUsername(friendUsernames);
        model.addAttribute("user", user);
        model.addAttribute("posts", posts);
        model.addAttribute("activeUsers", activeFriends);
        model.addAttribute("stories", storyService.getAllStories());

        return "dashboard";
    }


    @GetMapping("/post")
    public String getPostContent(){
        return "post";
    }

    @PostMapping("/post")
    public String post(@RequestParam String content, @RequestParam String imageUrl, HttpSession session) {

        User user = (User) session.getAttribute("user");
        Post post = new Post();
        post.setContent(content);
        post.setImageUrl(imageUrl);
        post.setUsername(user.getUsername());
        post.setUser(user);
        postService.save(post);
        return "redirect:/dash/dashboard";
    }

}
