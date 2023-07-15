package com.Guddu.StudentMapping.repo;

import com.Guddu.StudentMapping.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student, String> {
}
