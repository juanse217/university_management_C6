package com.sebastian.dev.universitymanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sebastian.dev.universitymanagement.model.entity.Dean;

public interface DeanRepository extends JpaRepository<Dean, Long>{

}
