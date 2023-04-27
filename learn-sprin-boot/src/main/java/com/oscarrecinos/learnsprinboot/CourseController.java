package com.oscarrecinos.learnsprinboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses(){
        return Arrays.asList(
            new Course(1,"Learn AWS","In 28 minutes"),
            new Course(2,"Learn DevOPs","In 28 minutes"),
            new Course(3,"Learn AZURE","In 28 minutes"),
            new Course(4,"Resident evil 4","In 28 minutes")
        );
    }
}
