package com.sebastian.dev.universitymanagement.model.entity;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "faculties")
public class Faculty {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "faculty_number")
    private Integer number; 

    @Column(name = "faculty_location", length = 250)
    private String location;

    @Column(name = "faculty_name", nullable = false, unique = true, length = 100)
    private String name;

    @OneToOne(mappedBy = "faculty", cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    private Dean dean;

    @OneToMany(mappedBy = "faculty", cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    private Set<Teacher> teachers;

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dean getDean() {
        return dean;
    }

    public void setDean(Dean dean) {
        this.dean = dean;
    }

    
}
