package com.restapi.oracle.crud.example.controller;

import com.restapi.oracle.crud.example.entity.Course;
import com.restapi.oracle.crud.example.service.CourseService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    private CourseService service;

    @PostMapping("/post")
    public Course addCourse(@RequestBody Course course) {
        return service.saveCourse(course);
    }

    @PostMapping("/posts")
    public List<Course> addCourses(@RequestBody List<Course> courses) {
        return service.saveCourses(courses);
    }

    @GetMapping("/get/all")
    public List<Course> findAllCourses() {
        return service.getCourses();
    }

    @GetMapping("/get/{id}")
    public Course findCourseById(@PathVariable String id) {
        return service.getCourseById(id);
    }

    @GetMapping("/get/course/{courseName}")
    public Course findCourseByName(@PathVariable String courseName) {
        return service.getCourseByName(courseName);
    }

    @PutMapping("/put/{id}")
    public Course updateCourse(@PathVariable String id,@RequestBody Course course) {
        return service.updateCourse(id,course);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteCourse(@PathVariable String id) {
        return service.deleteCourse(id);
    }
}
