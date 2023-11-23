package com.example.mapping_project.model;


import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="JPA_student")

public class Student {
    @Id
    @Column(name="SID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int sid;

    @Column(name="SNAME")
    private String sname;

    @ManyToMany
    @JoinTable(
        name = "JPA_mappedCourseStudent",
        joinColumns = @JoinColumn(name = "SID"),
        inverseJoinColumns = @JoinColumn(name = "CID")
    )
    private Set<Course> courses;

    //  Add the following to establish the relationship with the join table
    // @OneToMany(mappedBy = "student")
    // private Set<MappedCourseStudent> studentCourses;


    public int getSid() {
        return this.sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return this.sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Set<Course> getCourses() {
        return this.courses;
    }

    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }

}
