package com.Guddu.StudentMapping.service;

import com.Guddu.StudentMapping.model.Student;
import com.Guddu.StudentMapping.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepo studentRepository;


    public void deleteStudent(String id) {
        studentRepository.deleteById(id);
    }

    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();

    }

    public Student getStudentById(String id) {
        return studentRepository.findById(id).orElse(null);
    }
}
