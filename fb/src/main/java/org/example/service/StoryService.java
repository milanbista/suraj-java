package org.example.service;

import org.example.model.Story;
import org.example.repository.StoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoryService {

    @Autowired
    private StoryRepository repo;

    public void save(Story story) {
        repo.save(story);
    }

    public List<Story> getAllStories() {
        return repo.findAllByOrderByCreatedAtDesc();
    }
}
