package com.souptik.scm20.SCM20.controllers.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

import java.util.*;

@Entity
public class Contact {

    @Id
    private String id;
    @Column(nullable = false)
    private String name;
    private String email;
    private String phoneNumber;
    private String address;
    private String picture;
    private String description;
    private boolean favourite = false;
    // private String instagramLink;
    // private String facebookLink;
    private String websiteLink;

    // private List<String> socialLink = new ArrayList<>();

    @ManyToOne
    private User user;

    @OneToMany(mappedBy = "contact")
    private List<SocialLinks> socialLinks = new ArrayList<>();

}
