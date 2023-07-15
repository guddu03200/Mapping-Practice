package com.Guddu.StudentMapping.repo;

import com.Guddu.StudentMapping.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CourseRepo extends JpaRepository<Course, String> {

}
