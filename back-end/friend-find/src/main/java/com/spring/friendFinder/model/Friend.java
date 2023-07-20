package com.spring.friendFinder.model;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/*
meli katkon 3andna @Data f class mere kandiro @Setter @Getter bach maytl3olnach errors*/
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "friends")
public class Friend extends BaseEntity {

    @Column(name = "friend_id")
    private int idFriend;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

}
