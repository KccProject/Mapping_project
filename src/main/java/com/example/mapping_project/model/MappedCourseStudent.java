package com.example.mapping_project.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "JPA_mappedCourseStudent")
public class MappedCourseStudent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MAPPEDCOURSESTUDENT_ID")
    private Long mappedCourseStudentId;

    @ManyToOne
    @JoinColumn(name = "CID")
    private Course course;

    @ManyToOne
    @JoinColumn(name = "SID")
    private Student student;

    // Constructors, getters, and setters


    public MappedCourseStudent() {
    }

    public MappedCourseStudent(Long mappedCourseStudentId, Course course, Student student) {
        this.mappedCourseStudentId = mappedCourseStudentId;
        this.course = course;
        this.student = student;
    }

    public Long getMappedCourseStudentId() {
        return this.mappedCourseStudentId;
    }

    public void setMappedCourseStudentId(Long mappedCourseStudentId) {
        this.mappedCourseStudentId = mappedCourseStudentId;
    }

    public Course getCourse() {
        return this.course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Student getStudent() {
        return this.student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public MappedCourseStudent mappedCourseStudentId(Long mappedCourseStudentId) {
        setMappedCourseStudentId(mappedCourseStudentId);
        return this;
    }

    public MappedCourseStudent course(Course course) {
        setCourse(course);
        return this;
    }

    public MappedCourseStudent student(Student student) {
        setStudent(student);
        return this;
    }
    
}
