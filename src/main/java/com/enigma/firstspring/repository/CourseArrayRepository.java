package com.enigma.firstspring.repository;

import com.enigma.firstspring.entity.Course;
import com.enigma.firstspring.util.IRandomStringGenerator;
import com.thedeanda.lorem.Lorem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CourseArrayRepository implements ICourseRepository {
    IRandomStringGenerator generator;
    Lorem lorem;

    public CourseArrayRepository(@Qualifier("uuid") IRandomStringGenerator generator, Lorem lorem) {
        this.generator = generator;
        this.lorem = lorem;
    }

    private List<Course> courseList = new ArrayList<>();

    @Autowired
    @Qualifier("int")
    IRandomStringGenerator randomStringGenerator;

    @Override
    public List<Course> getAll() {
        return courseList;
    }

    @Override
    public Course create(Course course) {
        course.setCourseId(randomStringGenerator.random());
        course.setDescription(lorem.getWords(10));
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
