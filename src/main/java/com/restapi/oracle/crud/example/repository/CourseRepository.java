package com.restapi.oracle.crud.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restapi.oracle.crud.example.entity.Course;


public interface CourseRepository extends JpaRepository<Course,String> {
    Course findByCourseName(String courseName);
}

