package org.example.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;


@Entity
@Table(name = "friendships")
public class FriendshipRelation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "requester_id", nullable = false)
    private User requester;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "receiver_id", nullable = false)
    private User receiver;

    @Enumerated(EnumType.STRING)
    private FriendShipStatus status;


    private LocalDateTime createAt = LocalDateTime.now();

    public FriendshipRelation(User from, User to, FriendShipStatus friendShipStatus) {
        this.requester = from;
        this.receiver = to;
        this.status = friendShipStatus;
    }

    public Long getId() {
        return id;
    }

    public FriendshipRelation(){

    }

    public FriendshipRelation(Long id, User requester, User receiver, FriendShipStatus status, LocalDateTime createAt) {
        this.id = id;
        this.requester = requester;
        this.receiver = receiver;
        this.status = status;
        this.createAt = createAt;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getRequester() {
        return requester;
    }

    public void setRequester(User requester) {
        this.requester = requester;
    }

    public User getReceiver() {
        return receiver;
    }

    public void setReceiver(User receiver) {
        this.receiver = receiver;
    }

    public FriendShipStatus getStatus() {
        return status;
    }

    public void setStatus(FriendShipStatus status) {
        this.status = status;
    }

    public LocalDateTime getCreateAt() {
        return createAt;
    }

    public void setCreateAt(LocalDateTime createAt) {
        this.createAt = createAt;
    }
}
