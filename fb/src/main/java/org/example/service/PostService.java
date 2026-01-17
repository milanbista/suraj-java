package org.example.service;

import org.example.model.Post;
import org.example.model.User;
import org.example.repository.PostRepository;
import org.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private  PostRepository repo;

    public void save(Post post) {
        repo.save(post);
    }

    public List<Post> getAll() {
        return repo.findAllByOrderByCreatedAtDesc();
    }


}
