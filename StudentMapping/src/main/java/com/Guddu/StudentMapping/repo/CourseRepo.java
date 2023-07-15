package com.Guddu.StudentMapping.repo;

import com.Guddu.StudentMapping.model.Course;

import java.util.List;
import java.util.Optional;

public interface CourseRepo {
    List<Course> findAll();

    Optional<Object> findById(String id);

    Course save(Course course);

    void deleteById(String id);
}
