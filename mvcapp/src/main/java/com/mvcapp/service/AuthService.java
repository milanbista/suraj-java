package com.mvcapp.service;

import com.mvcapp.model.User;
import com.mvcapp.repository.UsersResository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private UsersResository usersResository;


    public String signup(User user){
        usersResository.save(user);
        return "ok";
    }
}
