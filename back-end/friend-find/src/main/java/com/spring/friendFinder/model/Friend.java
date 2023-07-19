package com.spring.friendFinder.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
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
