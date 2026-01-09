package com.pentasoftsolutions.redis;

import com.pentasoftsolutions.model.User;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class ActiveUsers {

    private Set<String> onlineUsers = new HashSet<>();

    public Set<String> getOnlineUsers() {

        for (String s: onlineUsers){
            System.out.println(s);
        }
        return onlineUsers;
    }

    public void setOnlineUsers(Set<String> onlineUsers) {
        this.onlineUsers = onlineUsers;
    }

    public void addOnlineUser(String username){
        this.onlineUsers.add(username);
    }
}
