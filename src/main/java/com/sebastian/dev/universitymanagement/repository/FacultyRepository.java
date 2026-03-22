package com.sebastian.dev.universitymanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sebastian.dev.universitymanagement.model.entity.Faculty;

public interface FacultyRepository extends JpaRepository<Faculty, Integer>{

    
}
