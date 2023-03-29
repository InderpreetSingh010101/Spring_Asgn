package com.SpringWeb.SpringWeb.controller;

import com.SpringWeb.SpringWeb.Course;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {
@RequestMapping("/courses")
public List<Course> retriveAllCourse(){
    return Arrays.asList(
            new Course(1 , "CompSC" , "JOURACS") ,
            new Course(2 , "SpringBoot" , "IPS"),
            new Course(3 , "SpringBootWeb" , "Ia")
    ) ;
}
}
