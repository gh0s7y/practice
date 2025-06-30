package com.example.demo.model;


import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="students")
public class Student {
    @Id
    @GeneratedValue
    private Long ID;
    private String firstname;
    private String lastname;
    private String mentor;
    private String olympiad;
    @Column(unique = true)
    private String StudentId;

}
