package com.enigma.firstspring;

import com.enigma.firstspring.container.ConsoleRunner;
import com.enigma.firstspring.entity.Course;
import com.enigma.firstspring.service.ICourseService;

public class ConsoleApp implements ConsoleRunner {
    private final ICourseService courseService;

    public ConsoleApp(ICourseService courseService) {
        this.courseService = courseService;
    }

    @Override
    public void run(String... args) {
        Course springCourse = new Course();
        springCourse.setCourseId("123");
        springCourse.setDescription("Spring IoC");
        springCourse.setTitle("Spring IoC Fundamental");

        Course reactCourse = new Course();
        reactCourse.setCourseId("456");
        reactCourse.setDescription("React Redux State");
        reactCourse.setTitle("React Redux");

        courseService.create(springCourse);
        courseService.create(reactCourse);
        courseService.list().forEach(course -> System.out.println(course));
    }
}
