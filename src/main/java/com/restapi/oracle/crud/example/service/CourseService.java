package com.restapi.oracle.crud.example.service;

import com.restapi.oracle.crud.example.entity.Course;
import com.restapi.oracle.crud.example.repository.CourseRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    private CourseRepository repository;

    public Course saveCourse(Course course) {
        return repository.save(course);
    }

    public List<Course> saveCourses(List<Course> courses) {
        return repository.saveAll(courses);
    }

    public List<Course> getCourses() {
        return repository.findAll();
    }

    public Course getCourseById(String id) {
        return repository.findById(id).orElse(null);
    }

    public Course getCourseByName(String name) {
        return repository.findByCourseName(name);
    }

    public String deleteCourse(String id) {
        repository.deleteById(id);
        return "course removed !! " + id;
    }

    public Course updateCourse(String id,Course course) {
        Course existingCourse = repository.findById(id).orElse(null);
        existingCourse.setCourseName(course.getCourseName());
        existingCourse.setRating(course.getRating());
        existingCourse.setPrice(course.getPrice());
        existingCourse.setTrainerName(course.getTrainerName());
        existingCourse.setNumberOfDays(course.getNumberOfDays());        
        return repository.save(existingCourse);
    }


}
