package org.example.controller;

import org.example.model.Story;
import org.example.model.User;
import org.example.service.StoryService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StoryController {
    @Autowired
    private StoryService storyService;

    @PostMapping("/story")
    public String uploadStory(@RequestParam String content, HttpSession session) {

        User user = (User) session.getAttribute("user");
        if (user == null) return "redirect:/login";

        Story story = new Story();
        story.setContent(content);
        story.setUser(user);

        storyService.save(story);

        return "redirect:/dash/dashboard";
    }
}
