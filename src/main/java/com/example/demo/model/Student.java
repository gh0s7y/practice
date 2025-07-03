package com.example.demo.model;


import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstname;
    private String lastname;
    private String mentor;
    private String olympiad;
    @Column(unique = true)
    private String StudentId;
    private String event_level;
    private String event_location;
    private String event_dates;
    private String event_organizers;
    private String filePath;
}
