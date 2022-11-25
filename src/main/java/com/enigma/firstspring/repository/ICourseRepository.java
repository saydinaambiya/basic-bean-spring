package com.enigma.firstspring.repository;

import com.enigma.firstspring.entity.Course;

import java.util.List;

public interface ICourseRepository {
    List<Course> getAll();
    Course create(Course course);
    Course findOne(String id);
    Course update(Course course);
    Course delete(String id);
    Course findByTitle(String title);
}
