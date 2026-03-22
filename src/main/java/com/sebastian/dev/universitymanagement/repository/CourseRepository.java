package com.sebastian.dev.universitymanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sebastian.dev.universitymanagement.model.entity.Course;

public interface CourseRepository extends JpaRepository<Course, String>{

}
