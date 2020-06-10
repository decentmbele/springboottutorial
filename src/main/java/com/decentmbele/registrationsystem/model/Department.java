package com.decentmbele.registrationsystem.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Department {
    //instances of the class

    @Id
    private long departmentId;

    private long departmentName;

    @OneToOne
    private Staff hod;

    @OneToMany(fetch = FetchType.EAGER,mappedBy="department",
            cascade = CascadeType.ALL)
    private List<Course> courses = new ArrayList<>();

    public Department() {
    }

    public Department(long departmentId, long departmentName, Staff hod, List<Course> courses) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.hod = hod;
        this.courses = courses;
    }

    public long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(long departmentId) {
        this.departmentId = departmentId;
    }

    public long getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(long departmentName) {
        this.departmentName = departmentName;
    }

    public Staff getHod() {
        return hod;
    }

    public void setHod(Staff hod) {
        this.hod = hod;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}
