package org.example.service;

import org.example.model.FriendShipStatus;
import org.example.model.FriendshipRelation;
import org.example.model.User;
import org.example.repository.FriendshipRepository;
import org.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
            List<User> allUsers =  userRepository.findAll();

            //get all friends
            List<FriendshipRelation> friendships = friendshipRepository.findFriends(user, FriendShipStatus.ACCEPTED);

            List<User> friends = new ArrayList<>();
            for(FriendshipRelation fr: friendships){
                if(fr.getRequester().getId().equals(user.getId())){
                    friends.add(fr.getReceiver());
                }else {
                    friends.add(fr.getRequester());
                }
            }
            //subtract users from friends
            List<User> availableUsers = new ArrayList<>();
            for (User u:allUsers){
                if(!u.getId().equals(user.getId())&&!friends.contains(u)){
                    availableUsers.add(u);
                }
            }







            //todo
//            availableFriends.add(new User("sample", "sample", "same", "same", "s", 12, LocalDateTime.now(), "sdf"));

            return availableUsers;

        }

        return null;
    }

    public User updateProfile(User loggedInUser, User updateData){
        if(loggedInUser==null || loggedInUser.getId()==null){
            return null;
        }
        User dbUser = userRepository.findByUsername(loggedInUser.getUsername());
        if(dbUser==null){
            return null;
        }
        dbUser.setFirstName(updateData.getFirstName());
        dbUser.setLastName(updateData.getLastName());

        return userRepository.save(dbUser);

    }

    @Transactional
    public String addFriend(User user, String username) {

        User to = userRepository.findByUsername(username);
        // Retrieve the user from database to ensure it's managed by Hibernate session
        User from = userRepository.findByUsername(user.getUsername());

        if (from == null || to == null) {
            return "error: user not found";
        }

        // Check if friendship already exists
        List<FriendshipRelation> existing = friendshipRepository.findByRequesterAndReceiver(from, to);
        if (!existing.isEmpty()) {
            return "error: friendship already exists";
        }

        FriendshipRelation fr = new FriendshipRelation(from, to, FriendShipStatus.PENDING);
        
        // Save the friendship relation directly
        friendshipRepository.save(fr);

        return "success";

    }
}
