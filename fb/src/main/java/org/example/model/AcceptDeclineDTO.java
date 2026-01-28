package org.example.model;

public class AcceptDeclineDTO {

    private Long friendshipId;

    AcceptDeclineDTO(){

    }
    public AcceptDeclineDTO(Long friendshipId) {
        this.friendshipId = friendshipId;
    }

    public Long getFriendshipId() {
        return friendshipId;
    }

    public void setFriendshipId(Long friendshipId) {
        this.friendshipId = friendshipId;
    }
}
