package com.decentmbele.registrationsystem.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Student {
    //instances of the class

    @Id
    private long studentId;
    @Column
    private long age;
    @Column
    private boolean fulltime;
    @Embedded
    private Person attendee;
    @OneToMany(fetch = FetchType.EAGER,
            cascade = CascadeType.ALL)
    private List<Course> courses = new ArrayList<>();

    public Student() {
    }

    public Student(long studentId, long age, boolean fulltime, Person attendee, List<Course> courses) {
        this.studentId = studentId;
        this.age = age;
        this.fulltime = fulltime;
        this.attendee = attendee;
        courses = new ArrayList<>();
    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public long getAge() {
        return age;
    }

    public void setAge(long age) {
        this.age = age;
    }

    public boolean isFulltime() {
        return fulltime;
    }

    public void setFulltime(boolean fulltime) {
        this.fulltime = fulltime;
    }

    public Person getAttendee() {
        return attendee;
    }

    public void setAttendee(Person attendee) {
        this.attendee = attendee;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}
