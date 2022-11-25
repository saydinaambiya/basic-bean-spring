package com.enigma.firstspring.repository;

import com.enigma.firstspring.entity.Course;
import com.enigma.firstspring.service.ICourseService;
import com.enigma.firstspring.util.IRandomStringGenerator;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class CourseArrayRepository implements ICourseRepository {
    private List<Course> courseList = new ArrayList<>();

    @Autowired
    IRandomStringGenerator randomStringGenerator;

    @Override
    public List<Course> getAll() {
        return courseList;
    }

    @Override
    public Course create(Course course) {
        course.setCourseId(randomStringGenerator.random());
        courseList.add(course);
        return course;
    }

    @Override
    public Course findOne(String id) {
        Course course = null;
        for (Course c : courseList) {
            if (c.getCourseId().equals(id)) {
                course = c;
            }
        }
        return course;
    }

    @Override
    public Course update(Course course) {
        int i = 0;
        for (Course c : courseList) {
            i++;
            if (c.getCourseId().equals(course.getCourseId())) {
                courseList.set(i - 1, course);
            }
        }
        return null;
    }

    @Override
    public Course delete(String id) {
        Course course = null;
        for (Course c : courseList) {
            if (c.getCourseId().equals(id)) {
                courseList.remove(c);
                break;
            }
        }
        return course;
    }

    @Override
    public Course findByTitle(String title) {
        Course course = null;
        for (Course c : courseList) {
            if (c.getTitle().equals(title)) {
                course = c;
            }
        }
        return course;
    }
}
