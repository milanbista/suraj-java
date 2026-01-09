package com.pentasoftsolutions.service;

import com.pentasoftsolutions.model.User;
import com.pentasoftsolutions.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class AuthService {
    @Autowired
    private UserRepository repo;

    public void signup(User user) {
        repo.save(user);
    }

    public User login(String username, String password) {
        System.out.println(username+"hellooooooo");
        User user = repo.findByUsername(username);
        if (user != null && user.getPassword().equals(password)) {
            return user;
        }
        return null;
    }

    public User getUser(String username){
        User user =  repo.findByUsername(username);
        System.out.println(user.getPosts().size());
        return user;
    }
}
