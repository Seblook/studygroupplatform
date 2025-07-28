package com.studygroup.entity;

import jakarta.persistence.*;
import java.util.Set;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;

    @ElementCollection
    private Set<String> courses;

    @OneToOne(cascade = CascadeType.ALL)
    private Schedule schedule;

    // Getters and setters
}
