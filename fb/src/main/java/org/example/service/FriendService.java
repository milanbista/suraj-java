package org.example.service;

import org.example.model.User;
import org.example.repository.FriendshipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FriendService {

    @Autowired
    private FriendshipRepository friendshipRepository;

    public List<User> getAcceptedFriends(User user){
        return friendshipRepository.findAcceptedFriends(user)
                .stream()
                .map(f->{
                    if(f.getRequester().getId().equals(user.getId())){
                        return f.getReceiver();
                    }else {
                        return f.getRequester();
                    }
                })
                .toList();
    }
}
