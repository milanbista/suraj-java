package org.example.redis;

import org.example.model.User;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

@Component
public class ActiveUsers {

    private final Set<String> onlineUsers = ConcurrentHashMap.newKeySet();

    public List<String> getOnlineUsers() {

        return onlineUsers.stream().collect(Collectors.toList());
    }


    public void addOnlineUser(String username){
        this.onlineUsers.add(username);
    }

    public void removeOnlineUser(String username){
        onlineUsers.remove(username);
    }
}
