package com.enigma.firstspring.service;

import com.enigma.firstspring.entity.Course;
import com.enigma.firstspring.repository.ICourseRepository;

import java.util.ArrayList;
import java.util.List;

public class CourseService implements ICourseService{
    private ICourseRepository courseRepository;

    public CourseService(ICourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public Course create(Course course) {
        return courseRepository.create(course);
    }

    public List<Course> list() {
        return courseRepository.getAll();
    }

    public Course getOne(String id) {
        return courseRepository.findOne(id);
    }

    @Override
    public Course getOneByTitle(String title) {
        return courseRepository.findByTitle(title);
    }

    @Override
    public Course delete(String id) {
        return courseRepository.delete(id);
    }

    @Override
    public Course updateCourse(Course course) {
        return courseRepository.update(course);
    }
}
