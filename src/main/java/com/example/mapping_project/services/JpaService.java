package com.example.mapping_project.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mapping_project.model.Course;
import com.example.mapping_project.model.MappedCourseStudent;
import com.example.mapping_project.model.Student;
import com.example.mapping_project.repository.CourseRepository;
import com.example.mapping_project.repository.StudentRepository;
import com.example.mapping_project.repository.mappedCourseStudentRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class JpaService {
    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private StudentRepository studentRepository;
    
    @Autowired
    private mappedCourseStudentRepository mappedCourseStudentRepository;


    public void saveCourse(Course course) {
        courseRepository.save(course);
    }
    public Course getCourseById(Integer courseId) {
        return courseRepository.findById(courseId).orElse(null);
    }

    public void saveStudent(Student student) {
        studentRepository.save(student);
    }
    public void saveMappedCourseStudent(MappedCourseStudent mappedCourseStudent) {
        mappedCourseStudentRepository.save(mappedCourseStudent);
    }

}
