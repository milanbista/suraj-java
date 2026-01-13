package com.suraj.service;

import com.suraj.model.Post;
import com.suraj.repository.PostRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    private final PostRepository repo;

    public PostService(PostRepository repo) {
        this.repo = repo;
    }

    public void save(Post post) {
        repo.save(post);
    }

    public List<Post> getAll() {
        return repo.findAllByOrderByCreatedAtDesc();
    }
}
