package com.decentmbele.registrationsystem.repository;

import com.decentmbele.registrationsystem.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
