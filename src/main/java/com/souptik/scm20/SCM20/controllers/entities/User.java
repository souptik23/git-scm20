package com.souptik.scm20.SCM20.controllers.entities;

import org.hibernate.event.internal.ProxyVisitor;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.*;

@Entity(name = "User")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {

    @Id
    private String userId;

    @Column(name = "username" , nullable = false)
    private String name;
    private String password;

    @Column(nullable = false , unique = true)
    private String emailId;
    private String role;
    private String about;
    private String profilePic;
    private String gender;

    @Column(nullable = false)
    private String phoneNumber;

    private boolean isVarified = false;
    private boolean emailVerified = false;
    private boolean phoneVerified = false;

    private Providers provider = Providers.SELF;
    private String providerId;

    // linking - mapping

    //mapping contacts
    @OneToMany(mappedBy = "user")
    private List<Contact> contacts = new ArrayList<>();

    //mapping social links


}
