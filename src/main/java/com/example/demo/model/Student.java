package com.example.demo.model;


import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="students")
public class Student {
    @Id
    @GeneratedValue
    private String firstname;
    private String lastname;
    private String mentor;
    private String olympiad;
    private String StudentId;
    private String event_level;
}
