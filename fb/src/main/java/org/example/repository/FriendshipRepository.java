package org.example.repository;

import org.example.model.FriendShipStatus;
import org.example.model.FriendshipRelation;
import org.example.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FriendshipRepository extends JpaRepository<FriendshipRelation, Long> {

    @Query("""
   SELECT f FROM FriendshipRelation f
   WHERE (f.requester = :user OR f.receiver = :user)
   AND f.status = :status
""")
    List<FriendshipRelation> findFriends(@Param("user") User user,
                                         @Param("status") FriendShipStatus status);


    @Query("""
       SELECT f FROM FriendshipRelation f
       WHERE (f.requester = :requester AND f.receiver = :receiver) 
       OR (f.requester = :receiver AND f.receiver = :requester)
            """)
    List<FriendshipRelation> findByRequesterAndReceiver(@Param("requester") User requester, @Param("receiver") User receiver);
}
