package com.spring.friendFinder.model;


import com.spring.friendFinder.model.enums.Gender;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

/*
 meli katkon 3andna @Data f class mere kandiro @Setter @Getter bach maytl3olnach errors*/
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "user")
public class User extends BaseEntity {

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "age")
    private String age;

    @Column(name = "phone")
    private String phone;

    @Temporal(TemporalType.DATE)
    @Column(name = "date")
    private Date date;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @OneToMany(mappedBy = "user")
    private List<Post> posts;

    @OneToMany(mappedBy = "user")
    private List<Friend> friends;

}
