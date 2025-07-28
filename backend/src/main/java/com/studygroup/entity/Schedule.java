package com.studygroup.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ElementCollection
    private List<String> availableTimes;

    // Getters and setters
}
