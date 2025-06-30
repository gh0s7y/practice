package com.example.demo.service;

import com.example.demo.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;


public interface StudentService {
    List<Student> findAllStudent();
    Student saveStudent(Student student);
    Student findById(String StudentId);
    Student updateStudent(Student student);
    void deleteStudent(String StudentId);
}
