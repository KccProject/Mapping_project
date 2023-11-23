package com.example.mapping_project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.mapping_project.model.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course,Integer>{
    
    
}
