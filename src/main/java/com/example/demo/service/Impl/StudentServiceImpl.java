package com.example.demo.service.Impl;

import com.example.demo.model.Student;

import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {
    private final StudentRepository repository;

    @Override
    @Transactional
    public List<Student> findAllStudent() {
        return repository.findAll();
    }

    @Override
    @Transactional
    public Student saveStudent(Student student) {
        return repository.save(student);  // Сохранение в БД
    }
}
