package com.spring.friendFinder.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "posts")
public class Post extends BaseEntity {


    @Column(name = "image_path")
    private String image;

    @Column(name = "text")
    private String text;

    @Column(name = "likes")
    private int like;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

}
