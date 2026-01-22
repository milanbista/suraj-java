package org.example.service;

import jakarta.servlet.http.HttpSession;
import org.example.model.User;
import org.example.redis.ActiveUsers;
import org.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ActiveUsers activeUsers;

    public void signup(User user){
        userRepository.save(user);
    }

    public User authenticateUser(String username, String password){
        return userRepository.findByUsernameAndPassword(username,password);
    }

    public void setUserOnline(User user, HttpSession session){
        session.setAttribute("user",user);
        activeUsers.addOnlineUser(user.getUsername());
    }

    public void logoutUser(HttpSession session){
        User user = (User) session.getAttribute("user");
        if(user != null){
            activeUsers.removeOnlineUser(user.getUsername());
        }
        session.invalidate();
    }
    public User getUser(String username) {
        return userRepository.findByUsername(username);
    }
}

