package com.example.mapping_project.controller;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mapping_project.model.Course;
import com.example.mapping_project.model.MappedCourseStudent;
import com.example.mapping_project.model.Student;
import com.example.mapping_project.services.JpaService;

@RestController
@RequestMapping("/api")
public class JpaController {
    @Autowired
    private JpaService jpaService;


    @PostMapping("/saveCourse")
public ResponseEntity<Map<String, String>> saveCourse(@RequestBody Course course) {
    try {
        jpaService.saveCourse(course);
        Map<String, String> response = new HashMap<>();
        response.put("message", "Course saved successfully");
        return ResponseEntity.ok(response);
    } catch (Exception e) {
        // Handle the exception and return an error response
        Map<String, String> errorResponse = new HashMap<>();
        errorResponse.put("error", "Error saving course");
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorResponse);
    }
}

    @PostMapping("/saveStudent")
public ResponseEntity<Map<String, String>> saveStudent(@RequestBody Student student) {
    try {
        jpaService.saveStudent(student);
        Map<String, String> response = new HashMap<>();
        response.put("message", "Student saved successfully");
        return ResponseEntity.ok(response);
    } catch (Exception e) {
        // Handle the exception and return an error response
        Map<String, String> errorResponse = new HashMap<>();
        errorResponse.put("error", "Error saving student");
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorResponse);
    }
}
@PostMapping("/saveMappedCourseStudent")
    public ResponseEntity<Map<String, String>> saveMappedCourseStudent(@RequestBody MappedCourseStudent mappedCourseStudent) {
        try {
            jpaService.saveMappedCourseStudent(mappedCourseStudent);
            Map<String, String> response = new HashMap<>();
            response.put("message", "MappedCourseStudent saved successfully");
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            // Handle the exception and return an error response
            Map<String, String> errorResponse = new HashMap<>();
            errorResponse.put("error", "Error saving MappedCourseStudent");
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorResponse);
        }
    }


}