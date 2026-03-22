package com.sebastian.dev.universitymanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sebastian.dev.universitymanagement.model.entity.Student;

public interface StudentRepository extends JpaRepository<Student, String>{

}
