package com.example.demo.model;


import jakarta.persistence.*;
import lombok.*;

@Data
@Builder
public class Student {

    private String firstname;
    private String lastname;
    private String mentor;
    private String olympiad;
    private String StudentId;

}
