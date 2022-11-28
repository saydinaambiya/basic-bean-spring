package com.enigma.firstspring;

import com.enigma.firstspring.config.BeanConfiguration;
import com.enigma.firstspring.container.AppContainer;
import com.enigma.firstspring.entity.Course;
import com.enigma.firstspring.service.ICourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

@ComponentScan
public class App {

    public static void main(String[] args) {
        AppContainer.run(App.class);
    }
}
