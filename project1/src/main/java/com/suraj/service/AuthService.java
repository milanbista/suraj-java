package com.suraj.service;

import com.suraj.model.User;
import com.suraj.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
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
}
