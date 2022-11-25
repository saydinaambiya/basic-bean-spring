package com.enigma.firstspring.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class Course {
    @Setter @Getter
    private String courseId;
    @Setter @Getter
    private String title;
    @Setter @Getter
    private String description;

}
