package com.Guddu.StudentMapping.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String ID;
    private String title;
    private String description;
    private String duration;


    @ManyToMany
    @JoinTable(name = "fk_course_student", joinColumns = @JoinColumn(name = "fk_course-id"), inverseJoinColumns = @JoinColumn(name = "fk_student-id"))
    List<Student> students;

    public static void setCourseId(String id) {
    }
}
