package com.enigma.firstspring.config;

import com.enigma.firstspring.repository.CourseArrayRepository;
import com.enigma.firstspring.repository.ICourseRepository;
import com.enigma.firstspring.service.CourseService;
import com.enigma.firstspring.service.ICourseService;
import com.enigma.firstspring.util.IRandomStringGenerator;
import com.enigma.firstspring.util.UidGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeanConfiguration {
    @Bean
    @Scope("prototype")
    public ICourseRepository getCourseRepository(){
        return new CourseArrayRepository();
    }

    @Bean
    @Scope("prototype")
    public ICourseService getCourseService(){
        return new CourseService(getCourseRepository());
    }

    @Bean
    public IRandomStringGenerator getRandomUid(){
        return new UidGenerator();
    }
}
