package com.enigma.firstspring.config;

import com.enigma.firstspring.repository.CourseArrayRepository;
import com.enigma.firstspring.repository.ICourseRepository;
import com.enigma.firstspring.service.CourseService;
import com.enigma.firstspring.service.ICourseService;
import com.enigma.firstspring.util.IRandomStringGenerator;
import com.enigma.firstspring.util.RandomInt;
import com.enigma.firstspring.util.UidGenerator;
import com.thedeanda.lorem.Lorem;
import com.thedeanda.lorem.LoremIpsum;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

@Configuration
@PropertySource("classpath:app.properties")
public class BeanConfiguration {
    @Bean
    public Lorem getLorem() {
        return LoremIpsum.getInstance();
    }

}
