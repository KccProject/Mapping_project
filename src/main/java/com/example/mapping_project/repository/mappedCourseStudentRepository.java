package com.example.mapping_project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.mapping_project.model.MappedCourseStudent;


@Repository
public interface mappedCourseStudentRepository extends JpaRepository<MappedCourseStudent,Long>{

}
