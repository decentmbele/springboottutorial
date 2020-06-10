package com.decentmbele.registrationsystem.model;

import javax.persistence.*;

@Entity
public class Course {
    //instances of the class

    @Id
    private long courseId;
    @Column
    private String courseName;
    @Column
    private Integer credit;
    @OneToOne
    private Staff instructor;
    @ManyToOne
    private Department department;

    public Course() {
    }

    public Course(long courseId, String courseName, Integer credit, Staff instructor, Department department) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.credit = credit;
        this.instructor = instructor;
        this.department = department;
    }

    public long getCourseId() {
        return courseId;
    }

    public void setCourseId(long courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Integer getCredit() {
        return credit;
    }

    public void setCredit(Integer credit) {
        this.credit = credit;
    }

    public Staff getInstructor() {
        return instructor;
    }

    public void setInstructor(Staff instructor) {
        this.instructor = instructor;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
