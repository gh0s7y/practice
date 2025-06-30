package com.example.demo.repository;

import com.example.demo.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Repository
public class InMemoryStudentDAO {

    private final List<Student> STUDENTS = new ArrayList<>();

    public List<Student> findAllStudent() {
        return STUDENTS;
    }

    public Student saveStudent(Student student) {
        STUDENTS.add(student);
        return student;
    }

    public Student findById(String StudentId) {
        return STUDENTS.stream()
                .filter(element -> element.getStudentId().equals(StudentId))
                .findFirst()
                .orElse(null);
    }

    public Student updateStudent(Student student) {
        var StudentIndex = IntStream.range(0, STUDENTS.size())
                .filter(index->STUDENTS.get(index).getStudentId().equals(student.getStudentId()))
                .findFirst()
                .orElse(-1);
        if (StudentIndex > -1){
            STUDENTS.set(StudentIndex, student);
            return student;
        }
        return null;
    }

    public void deleteStudent(String StudentId) {
        var student = findById(StudentId);
        if (student != null){
            STUDENTS.remove(student);
        }
    }
}
