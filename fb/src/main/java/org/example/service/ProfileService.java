package org.example.service;

import org.example.model.FriendShipStatus;
import org.example.model.FriendshipRelation;
import org.example.model.User;
import org.example.repository.FriendshipRepository;
import org.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProfileService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private FriendshipRepository friendshipRepository;


    public List<User> getAvailableUsers(User user){
        if (null != user){
            //get all users
            List<User> users =  userRepository.findAll();

            //get all friends
            List<FriendshipRelation> friends = friendshipRepository.findFriends(user, FriendShipStatus.ACCEPTED);

            //subtract users from friends
            List<User> availableFriends = new ArrayList<>();

            //todo
            availableFriends.add(new User("sample", "sample", "same", "same", "s", 12, LocalDateTime.now(), "sdf"));

            return availableFriends;

        }

        return null;
    }
}
