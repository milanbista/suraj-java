package org.example.service;

import org.example.model.FriendShipRequestDTO;
import org.example.model.FriendshipRelation;
import org.example.model.PostLike;
import org.example.model.User;
import org.example.repository.PostLikesRepository;
import org.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class FeedService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PostLikesRepository postLikesRepository;


    @Transactional
    public List<FriendShipRequestDTO> friendRequests(User user){

        User freshUser = userRepository.findByUsername(user.getUsername());

       List<FriendshipRelation> receivedRequests =   freshUser.getReceivedRequest();

       List<FriendShipRequestDTO> temp = new ArrayList<>();

       for (FriendshipRelation rel: receivedRequests){
           Long id = rel.getId();
           String username = rel.getRequester().getUsername();
           String firstName = rel.getRequester().getFirstName();
           String lastName = rel.getRequester().getLastName();
           String status = String.valueOf(rel.getStatus());

           if(!status.equals("ACCEPTED")){
               temp.add(new FriendShipRequestDTO(id, username, firstName, lastName, status));
           }

       }

       return temp;

    }

    @Transactional
    public void postLike(Long postId, User user) {

        User freshUser = userRepository.findByUsername(user.getUsername());

        Long userId = freshUser.getId();

        //post_id and user_id
        PostLike postLike = new PostLike(postId, userId);

        //save to db
       // postLikesRepository.save()



    }
}
