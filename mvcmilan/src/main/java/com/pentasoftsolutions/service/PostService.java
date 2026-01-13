package com.pentasoftsolutions.service;

import com.pentasoftsolutions.model.Post;
import com.pentasoftsolutions.model.User;
import com.pentasoftsolutions.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    @Autowired
    private  PostRepository repo;



    public void save(Post post) {
        repo.save(post);
    }

    public List<Post> getAll() {
        return repo.findAllByOrderByCreatedAtDesc();
    }


}
