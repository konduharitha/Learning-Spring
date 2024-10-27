package com.hari.springboot.learnspringboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Course> returnAllCourses(){
        return Arrays.asList(
                new Course(1,"learn AWS","in28minutes"),
                new Course(2,"learn DevOps","in28minutes")
        );
    }

}
